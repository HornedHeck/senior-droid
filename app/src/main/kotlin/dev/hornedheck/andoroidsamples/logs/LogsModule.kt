package dev.hornedheck.andoroidsamples.logs

import android.app.Application
import org.koin.dsl.module

internal val logsModule = module {
    factory<Application.ActivityLifecycleCallbacks> { ActivityLifecycleLogger() }
}