package ktor.sample.data

import io.ktor.jackson.*
import ktor.sample.model.*

class DateResponse(val date: CustomDate) : ResponseInterface {
    override fun json(): Map<String, Any> {
        return mapOf(
            "isoLocalDate" to date.isoLocalDate(),
            "isBusinessDay" to date.isBusinessDay()
        )
    }
}