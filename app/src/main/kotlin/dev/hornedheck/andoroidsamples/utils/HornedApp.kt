package dev.hornedheck.andoroidsamples.utils

import android.app.Application
import dev.hornedheck.andoroidsamples.logs.logsModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class HornedApp : Application() {

    override fun onCreate() {
        super.onCreate()

        val koin = startKoin {
            androidContext(this@HornedApp)
            modules(logsModule)
        }.koin

        val lifecycleLogger = koin.get<ActivityLifecycleCallbacks>()
        registerActivityLifecycleCallbacks(lifecycleLogger)
    }

}