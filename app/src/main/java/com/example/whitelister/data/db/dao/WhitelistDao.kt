package com.example.whitelister.data.db.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.whitelister.data.db.entity.WhitelistedChatEntity

@Dao
interface WhitelistDao {

    @Query("SELECT EXISTS(SELECT 1 FROM whitelisted_chats WHERE chatId = :chatId)")
    fun isWhitelisted(chatId: Long): Boolean

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(chat: WhitelistedChatEntity)

    @Delete
    fun delete(chat: WhitelistedChatEntity)
}
