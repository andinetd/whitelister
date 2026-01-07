package com.yourpackage.domain

import java.time.Instant

class NotificationGateUseCase(
    private val notificationPolicy: NotificationPolicy
) {
    fun shouldNotify(now: Instant): Boolean {
        return notificationPolicy.isWithinNotificationWindow(now)
    }
}
