package ktor.sample.data

interface ResponseInterface {
    fun json(): Map<String, Any> 
}