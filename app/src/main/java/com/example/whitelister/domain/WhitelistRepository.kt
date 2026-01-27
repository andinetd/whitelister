package com.yourpackage.domain

interface WhitelistRepository {
    fun isWhitelisted(chatId: Long): Boolean
}

class WhitelistRepository {

}
