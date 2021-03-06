package strongdmm.service.preferences

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import strongdmm.PostInitialize
import strongdmm.Service
import strongdmm.StrongDMM
import strongdmm.event.EventHandler
import strongdmm.event.type.Provider
import strongdmm.event.type.service.TriggerPreferencesService
import strongdmm.service.preferences.prefs.Preference
import java.io.File

class PreferencesService : Service, EventHandler, PostInitialize {
    companion object {
        private val preferencesConfig: File = File(StrongDMM.homeDir.toFile(), "preferences.json")
    }

    private lateinit var preferences: Preferences
    private val objectMapper: ObjectMapper = ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)

    init {
        consumeEvent(TriggerPreferencesService.SavePreferences::class.java, ::handleSavePreferences)
    }

    override fun postInit() {
        ensurePreferencesConfigExists()
        readPreferencesConfig()
        applyModifiedPreferences()

        sendEvent(Provider.PreferencesServicePreferences(preferences))
    }

    private fun ensurePreferencesConfigExists() {
        if (preferencesConfig.createNewFile()) {
            writePreferencesConfig(preferences)
        }
    }

    @Suppress("UNCHECKED_CAST")
    private fun readPreferencesConfig() {
        try {
            preferences = objectMapper.readValue(preferencesConfig, Preferences::class.java)
            preferences.rawValues = preferences::class.java.declaredFields.mapNotNull {
                it.isAccessible = true
                it.get(preferences) as? Preference<Any>
            }
        } catch (e: Exception) {
            writePreferencesConfig(Preferences())
            readPreferencesConfig()
        }
    }

    private fun writePreferencesConfig(preferences: Preferences) {
        objectMapper.writeValue(preferencesConfig, preferences)
    }

    private fun handleSavePreferences() {
        applyModifiedPreferences()
        writePreferencesConfig(preferences)
    }

    private fun applyModifiedPreferences() {
        preferences.rawValues.forEach(Preference<Any>::applyModify)
    }
}
