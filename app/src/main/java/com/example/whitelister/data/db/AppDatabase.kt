package com.example.whitelister.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.whitelister.data.db.dao.WhitelistDao
import com.example.whitelister.data.db.entity.WhitelistedChatEntity

@Database(
    entities = [WhitelistedChatEntity::class],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun whitelistDao(): WhitelistDao
}
