package com.rsk

import java.security.Provider
import java.security.Security

/**
 * Created by John Tangarife on 12/5/16.
 */
class Providers {

    fun getProviders(): List<Provider> {
        val providers = Security.getProviders()
        val listOfProviders:List<Provider> = providers.asList()
        return listOfProviders
    }

//    singleton
    companion object{
        fun getProviders() : List<Provider>{
            val providers = Security.getProviders()
            val listOfProviders = providers.asList()
            return listOfProviders
        }
    }


}