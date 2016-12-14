import com.rsk.Providers

/**
 * Created by John Tangarife on 12/5/16.
 */
fun main(args: Array<String>){

    val allProviders = Providers.getProviders()

    val it = allProviders.iterator()

    while (it.hasNext()) {

        val provider = it.next()

        println(provider.name)

        provider.forEach { key, value -> println("\t$key: $value") }
    }
}

fun listProviders() {
    val providers = getProviders()

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