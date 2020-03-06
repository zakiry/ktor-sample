package ktor.sample.model

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*

import java.time.*
import java.time.format.DateTimeFormatter

class CustomDate(val date: LocalDate) {
    fun isoLocalDate(): String {
        return date.format(DateTimeFormatter.ISO_LOCAL_DATE)
    }

    fun isBusinessDay(): Boolean {
        val dayOfWeek = date.getDayOfWeek()
        return dayOfWeek != DayOfWeek.SATURDAY && dayOfWeek != DayOfWeek.SUNDAY
    }

    fun jsonValue(): Map<String, Any> {
        return mapOf(
            "isoLocalDate" to isoLocalDate(),
            "isBusinessDay" to isBusinessDay()
        )
    }
}