package ktor.sample.service

import java.time.*
import ktor.sample.model.*
import ktor.sample.data.*

class DateService() {
    fun currentDate(): ResponseInterface {
        val date = CustomDate(LocalDate.now())
        return DateResponse(date)
    }

    fun nextDate(n: Long): ResponseInterface {
        val date = CustomDate(LocalDate.now().plusDays(n))
        return DateResponse(date)
    }

    fun nextBusinessDate(n: Long): ResponseInterface {
        var count = 0
        var i: Long = 1
        while(true) {
            val date = CustomDate(LocalDate.now().plusDays(i))
            if (date.isBusinessDay()) {
                count++
                if(n.compareTo(count)==0) {
                    return DateResponse(date)
                }
            }
            i++
        }
    }
}