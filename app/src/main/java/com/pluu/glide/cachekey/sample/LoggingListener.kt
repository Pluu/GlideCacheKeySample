package com.pluu.glide.cachekey.sample

import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import logcat.logcat

class LoggingListener<R> : RequestListener<R> {
    override fun onResourceReady(
        resource: R,
        model: Any?,
        target: com.bumptech.glide.request.target.Target<R>?,
        dataSource: DataSource?,
        isFirstResource: Boolean
    ): Boolean {
        logcat("GLIDE") {
            "onResourceReady(%s, %s, %s)".format(model, dataSource, isFirstResource)
        }
        return false
    }

    override fun onLoadFailed(
        e: GlideException?,
        model: Any?,
        target: com.bumptech.glide.request.target.Target<R>?,
        isFirstResource: Boolean
    ): Boolean {
        logcat("GLIDE") {
            "onException(%s, %s, %s)".format(e, model, isFirstResource)
        }
        return false
    }
}