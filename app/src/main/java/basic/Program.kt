/**
 * Created by John Tangarife on 12/5/16.
 */
// Version 1
//fun samples.main(args: Array<String>){
//
//    val allProviders = Providers.getProviders()
//
//    val it = allProviders.iterator()
//
//    while (it.hasNext()) {
//
//        val provider = it.next()
//
//        println(provider.name)
//
//        provider.forEach { key, value -> println("\t$key: $value") }
//    }
//}
//
//fun listProviders() {
//    val providers = getProviders()
//
//}
//
//fun listOfProvidersInstance(){
//    val providers = Providers()
//    val allProviders = providers.getProviders()
//
//    val it = allProviders.iterator()
//
//    while (it.hasNext()){
//        val provider = it.next()
//
//        println(provider.name)
//        provider.forEach { key, value -> println("\t$key: $value") }
//    }
//}

//Version 2 functional style
fun main(args: Array<String>){

//    val providers = Providers()
//    val details = providers.getAllProviders("Random")

    //Kotlin provides name to var details so we only have to reference entry as
    // "it" and define the behaviour
    // as we have ProviderDetails as data object we can just print it
//    details.forEach { println("${it.providerName}, ${it.name}") }
//    details.forEach { println(it) }
//    Or we can call for each passing print function
    // we are passing a function, this function passes a single parameter
//    details.forEach(::println)

//    getAllProviders{
//        key, value -> println("\t$key: $value")
//    }
}

//function that receives type function
//Function that takes two parameter and returns Unit (nothing)
fun getAllProviders(fn: (String, String) -> Unit){
    val allProviders = Providers.getProviders()

    val it = allProviders.iterator()

    while (it.hasNext()) {

        val provider = it.next()

        println(provider.name)

        provider.forEach { key, value -> fn(key.toString(), value.toString()) }
    }
}

fun listOfProvidersInstance(){
    val providers = Providers()
    val allProviders = providers.getProviders()

    val it = allProviders.iterator()

    while (it.hasNext()){
        val provider = it.next()

        println(provider.name)
        provider.forEach { key, value -> println("\t$key: $value") }
    }
}