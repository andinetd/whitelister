package com.yourpackage.data.repository

import com.example.whitelister.data.db.dao.WhitelistDao
import com.yourpackage.domain.WhitelistRepository
import javax.inject.Inject

class WhitelistRepositoryImpl @Inject constructor(
    private val whitelistDao: WhitelistDao
) : WhitelistRepository {

    override fun isWhitelisted(chatId: Long): Boolean {
        // Direct delegation to DAO.
        // Logic remains simple for now to ensure the bridge works.
        return whitelistDao.isWhitelisted(chatId)
    }
}