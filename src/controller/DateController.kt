package ktor.sample.controller

import io.ktor.application.*
import io.ktor.request.*
import io.ktor.response.*
import io.ktor.routing.*
import java.time.*
import java.time.format.DateTimeFormatter

import ktor.sample.data.*
import ktor.sample.service.*

fun Route.dateController() {
    // TODO: Kodein を使って DI する
    val dateService = DateService()

    route("/date") {
        get("/current") {
            call.respond(dateService.currentDate().json())
        }

        get("/next") {
            val request = call.receive<DateNextRequest>()
            call.respond(dateService.nextDate(request.diff).json())
        }

        get("/nextBusinessDay") {
            val request = call.receive<DateNextBusinessDayRequest>()
            call.respond(dateService.nextBusinessDate(request.diff).json())
        }
    }
}
