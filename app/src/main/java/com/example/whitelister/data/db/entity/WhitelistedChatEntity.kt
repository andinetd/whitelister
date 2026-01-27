
package com.example.whitelister.data.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "whitelisted_chats")
data class WhitelistedChatEntity(
    @PrimaryKey val chatId: Long,
    val title: String
)
