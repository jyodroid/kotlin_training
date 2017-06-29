package iii_conventions

import java.util.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        val calendarThis: Calendar = Calendar.getInstance()
        calendarThis.set(this.year, this.month, this.dayOfMonth)

        val calendarDate: Calendar = Calendar.getInstance()
        calendarDate.set(other.year, other.month, other.dayOfMonth)

        return calendarThis.compareTo(calendarDate)
    }

    operator fun plus(timeInterval: TimeInterval): MyDate = this.addTimeIntervals(timeInterval, 1)

    operator fun plus(repeatedTimeInterval: RepeatedTimeInterval): MyDate =
            this.addTimeIntervals(repeatedTimeInterval.ti, repeatedTimeInterval.n)

    operator fun rangeTo(other: MyDate): DateRange = DateRange(this, other)
}

enum class TimeInterval {
    DAY,
    WEEK,
    YEAR;

    operator fun times(i: Int): RepeatedTimeInterval {
        return RepeatedTimeInterval(this, i);
    }
}

class RepeatedTimeInterval(val ti: TimeInterval, val n: Int)

class DateRange(val start: MyDate, val endInclusive: MyDate) : Iterator<MyDate> {

    private var date: MyDate = start

    override fun next(): MyDate {
        val oldDate = date
        date = date.nextDay()
        return oldDate
    }

    override fun hasNext(): Boolean {
        return endInclusive >= date
    }

    operator fun contains(date: MyDate): Boolean = (start <= date) && (endInclusive >= date)
}
