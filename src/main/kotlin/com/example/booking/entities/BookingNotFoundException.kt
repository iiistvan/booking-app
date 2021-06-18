package com.example.booking.entities

import org.springframework.http.HttpStatus

class BookingNotFoundException(status: HttpStatus, message: String): Exception(message) {

}
