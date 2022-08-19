package dev.hornedheck.andoroidsamples.logs

import android.app.Activity
import android.app.Application
import android.os.Bundle
import android.util.Log

class ActivityLifecycleLogger : Application.ActivityLifecycleCallbacks {

    override fun onActivityCreated(activity: Activity, bundle: Bundle?) {
        Log.d(TAG, "${activity.javaClass.name} created")
    }

    override fun onActivityStarted(activity: Activity) {
        Log.d(TAG, "${activity.javaClass.name} started")
    }

    override fun onActivityResumed(activity: Activity) {
        Log.d(TAG, "${activity.javaClass.name} resumed")
    }

    override fun onActivityPaused(activity: Activity) {
        Log.d(TAG, "${activity.javaClass.name} paused")
    }

    override fun onActivityStopped(activity: Activity) {
        Log.d(TAG, "${activity.javaClass.name} stopped")
    }

    override fun onActivitySaveInstanceState(activity: Activity, bundle: Bundle) {
//        Do nothing
    }

    override fun onActivityDestroyed(activity: Activity) {
        Log.d(TAG, "${activity.javaClass.name} destroyed")
    }

    companion object {

        const val TAG = "ACTIVITY_LIFECYCLE"

    }
}