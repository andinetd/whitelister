package com.yourpackage.domain

class FilterWhitelistedMessagesUseCase(
    private val whitelistRepository: WhitelistRepository
) {
    fun execute(message: Message): Message? {
        return if (whitelistRepository.isWhitelisted(message.chatId)) {
            message
        } else {
            null
        }
    }
}
