package com.pluu.glide.cachekey.sample

import android.app.Application
import logcat.AndroidLogcatLogger
import logcat.LogPriority

class SampleApp : Application() {
    override fun onCreate() {
        super.onCreate()
        AndroidLogcatLogger.installOnDebuggableApp(this, minPriority = LogPriority.VERBOSE)
    }
}