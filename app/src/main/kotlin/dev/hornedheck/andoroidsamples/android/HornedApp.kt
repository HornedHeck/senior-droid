package dev.hornedheck.andoroidsamples.android

import android.app.Application
import dev.hornedheck.andoroidsamples.logs.ActivityLifecycleLogger

class HornedApp : Application() {

    override fun onCreate() {
        super.onCreate()

        val lifecycleLogger = ActivityLifecycleLogger()
        registerActivityLifecycleCallbacks(lifecycleLogger)
    }

}