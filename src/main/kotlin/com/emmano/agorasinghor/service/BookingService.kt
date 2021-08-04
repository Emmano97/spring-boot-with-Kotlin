package com.emmano.agorasinghor.service

import com.emmano.agorasinghor.domain.Seat
import org.springframework.stereotype.Service

@Service
class BookingService {
    fun isSeatFree(seat: Seat): Boolean = true
}