package com.example.whitelister.di

import com.example.whitelister.domain.FilterWhitelistedMessagesUseCase
import com.example.whitelister.domain.NotificationGateUseCase
import com.example.whitelister.domain.NotificationPolicy
import com.yourpackage.domain.WhitelistRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    fun provideFilterWhitelistedMessagesUseCase(
        whitelistRepository: WhitelistRepository
    ): FilterWhitelistedMessagesUseCase =
        FilterWhitelistedMessagesUseCase(whitelistRepository)

    @Provides
    fun provideNotificationGateUseCase(
        notificationPolicy: NotificationPolicy
    ): NotificationGateUseCase =
        NotificationGateUseCase(notificationPolicy)
}
