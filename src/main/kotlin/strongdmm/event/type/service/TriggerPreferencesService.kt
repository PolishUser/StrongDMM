package strongdmm.event.type.service

import strongdmm.event.Event

abstract class TriggerPreferencesService {
    class SavePreferences : Event<Unit, Unit>(Unit, null)
}
