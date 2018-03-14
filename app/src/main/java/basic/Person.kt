package com.rsk

/**
 * Created by John Tangarife on 12/12/16.
 */
/**
 * Everything in kotlin is public by default
 */
interface Signatory {

    /**
     * Define methods
     */
    fun sign() {

    }
}

//Implement interface
//val is immutable, var can change an has getters and setters
//Classes are final by default
//age default value is 0. In kotlin if val is not defined throws a compilation time error
open class Person(val name: String, var age: Int = 0) : Signatory {

    //init block runs after object is constructed
    init {
        if (age > 60) throw Exception("Invalid age")
    }

    //Properties
    var coupleName = ""

    var isMarried = false

//    secondary constructor
    constructor(name: String, age: Int, isMarried: Boolean) : this(name, age){
        this.isMarried = isMarried
    }

    //There are no static in kotlin but is defined the concept of "companion object"
    companion object{
        //kotlin annotation to run a companion
        @JvmStatic
        fun main(args: Array<String>) {
            val p = Person("John", 30)

            //Class attribute setter
            p.coupleName = "Jeimmy"
            p.sign()

            //Class attribute getter
            println("partner name is ${p.coupleName}")
        }
    }

    //Class methods
    fun display(){
        println("Display: $name")
    }

    fun displayWithLambda(func: (s:String) -> Unit){
        func(name)
    }

    //Method expression
    override fun sign() =
            println("$name aged $age I am doing a method expression and " +
                    "his marital status is $isMarried with $coupleName")
}

//Implement interface
//val is immutable, var can change an has getters and setters
//Classes are final by default
//class Person2(val name: String, var age: Int) : Signatory {
//
//    //Method expression
//    override fun sign() = println("$name aged $age I am doing a method expression")
//}


// To inheritance from a class we will need to declare it (the parent) as `open`
//class Student(name: String, age: Int) : Person2(name, age){
//
//}

class Student(name: String, age: Int) : Person(name, age){

}

// kotlin has classes that only holds data (as models?) and provides methods as equals, hashCode,
// toString ...
data class User (val name: String, val id:Int)

fun main(args: Array<String>) {
    val p = Person("John", 30)

    p.display()

    p.sign()

//    val for constant val is not mutable
//    p.name = "a"

    p.age = 61
    p.sign()

    if (p.name == "John"){
        println("Same name")
    }

    val kevin = User("Kevin", 1)

    println(kevin)

    //Decomposed the object in touples
    val (name, id) = kevin

    println("User is $name and id is $id")

    //Copy object
    val otherUser = kevin.copy(id = 2)

    println(otherUser)
}