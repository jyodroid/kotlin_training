package ii_collections

fun example2(list: List<Int>) {

    val isZero: (Int) -> Boolean = { it == 0 }

    val hasZero: Boolean = list.any(isZero)

    val allZeros: Boolean = list.all(isZero)

    val numberOfZeros: Int = list.count(isZero)

    val firstPositiveNumber: Int? = list.firstOrNull { it > 0 }
}

fun Customer.isFrom(city: City): Boolean {
    // Return true if the customer is from the given city
//    todoCollectionTask()
    return this.city == city
}

fun Shop.checkAllCustomersAreFrom(city: City): Boolean {
    // Return true if all customers are from the given city
//    todoCollectionTask()
    return this.customers.all { it.city == city }
}

fun Shop.hasCustomerFrom(city: City): Boolean {
    // Return true if there is at least one customer from the given city
//    todoCollectionTask()
    val isFromCity: (Customer) -> Boolean = { it.city == city }
    return this.customers.any(isFromCity)
}

fun Shop.countCustomersFrom(city: City): Int {
    // Return the number of customers from the given city
//    todoCollectionTask()
    val isFromCity: (Customer) -> Boolean = { it.city == city }
    return this.customers.count(isFromCity)
}

fun Shop.findAnyCustomerFrom(city: City): Customer? {
    // Return a customer who lives in the given city, or null if there is none
//    todoCollectionTask()
    val isFromCity: (Customer) -> Boolean = { it.city == city }
    return this.customers.firstOrNull(isFromCity)
}
