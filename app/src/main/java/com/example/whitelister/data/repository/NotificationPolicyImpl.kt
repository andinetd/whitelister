package com.yourpackage.data.repository

import com.yourpackage.domain.NotificationPolicy
import java.time.Instant
import javax.inject.Inject

class NotificationPolicyImpl @Inject constructor(
    // Preferences will be injected later
) : NotificationPolicy {

    override fun isWithinNotificationWindow(now: Instant): Boolean {
        return true
    }
}
