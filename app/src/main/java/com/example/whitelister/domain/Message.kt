package com.yourpackage.domain

import java.time.Instant

data class Message(
    val id: Long,
    val chatId: Long,
    val timestamp: Instant,
    val text: String
)
