package basic

import java.io.IOException

/**
 * Created by johntangarife on 12/27/17.
 */
fun main(args: Array<String>) {

    //Java style exception handling
    try {
        println(getExternalInput())
    } catch (ioe: IOException) {
        ioe.printStackTrace()
    } finally {
        println("We have to do this")
    }

    //Kotlin style error handling

    val externalInput = try {
        getExternalInput()
    }catch (ioe: IOException){
        ioe.printStackTrace()
        "" // set input empty string
    }finally {
        println("ha we do this anyways")
    }

    println(externalInput)
}

private fun getExternalInput(): String {
    throw IOException("Some problems obtaining file")
}