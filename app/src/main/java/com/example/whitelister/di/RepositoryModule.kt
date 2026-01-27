package com.whitelister.di

import com.yourpackage.data.repository.NotificationPolicyImpl
import com.yourpackage.data.repository.WhitelistRepositoryImpl
import com.yourpackage.domain.NotificationPolicy
import com.yourpackage.domain.WhitelistRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindWhitelistRepository(
        impl: WhitelistRepositoryImpl
    ): WhitelistRepository

    @Binds
    @Singleton
    abstract fun bindNotificationPolicy(
        impl: NotificationPolicyImpl
    ): NotificationPolicy
}