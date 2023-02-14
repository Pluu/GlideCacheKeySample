package com.pluu.glide.cachekey.sample

import com.bumptech.glide.load.model.GlideUrl

class GlideUrlWithCacheKey(
    imageUrl: String,
    private val cacheKey: String
) : GlideUrl(imageUrl) {
    override fun getCacheKey(): String = cacheKey
}