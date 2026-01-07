package com.yourpackage.domain

import java.time.Instant

interface NotificationPolicy {
    fun isWithinNotificationWindow(now: Instant): Boolean
}

