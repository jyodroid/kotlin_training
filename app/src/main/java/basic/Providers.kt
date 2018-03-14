import java.security.Provider
import java.security.Security

/**
 * Created by John Tangarife on 12/5/16.
 */
data class ProviderDetails(val providerName: String, val name: String)

class Providers {

    fun getProviders(): List<Provider> {

//        Inmutable. Constant value
        val providers = Security.getProviders()

//        Colections conversion
        return providers.asList()
    }

    fun getAllProviders() : List<ProviderDetails>{

        val providers = Security.getProviders()

        //Kotlin type inference, maps
        val listOfProviders = mutableListOf<ProviderDetails>()

        providers.forEach {
            provider ->
            val providerDetails =
                    provider.entries.map {
                        //Kotlin provides name to var entry so we only have to reference entry as
                        // "it" and define the behaviour
//                        entry  -> ProviderDetails(provider.name, entry.key.toString())}
                        ProviderDetails(provider.name, it.key.toString())}
            //Two ways to do it
//            listOfProviders.addAll(providerDetails)
            listOfProviders += providerDetails
        }

        return listOfProviders;
    }

    companion object{
        fun getProviders() : List<Provider>{
            val providers = Security.getProviders()
            return providers.asList()
        }
    }


}