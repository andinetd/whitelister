import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.stringPreferencesKey
import java.util.prefs.Preferences

class NotificationPreferences(
    private val dataStore: DataStore<Preferences>
) {
    companion object {
        val START_TIME = stringPreferencesKey("start_time")
        val END_TIME = stringPreferencesKey("end_time")
    }
}

