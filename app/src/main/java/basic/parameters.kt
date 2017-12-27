package basic

fun main(args: Array<String>) {

    //Use the default separator
    val heroConcatenated = concat(listOf("Luke", "Batman", "Kenshin"))
    println(heroConcatenated)

    // Say explicitly the separator value
    val evilConcatenated = concat(listOf("Vader", "Joker", "Shisho"), " X ")
    println(evilConcatenated)

    // Change the order of passing the arguments of function
    val girlConcatenated = concat(separator = " - ", texts = listOf("Leia", "Barbara", "Kahoru"))
    println(girlConcatenated)
}

fun concat(texts: List<String>, separator: String = "; ") = texts.joinToString(separator)// Default separator