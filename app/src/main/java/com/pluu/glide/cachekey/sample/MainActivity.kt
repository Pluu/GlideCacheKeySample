package com.pluu.glide.cachekey.sample

import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.pluu.glide.cachekey.sample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLoad1.setOnClickListener {
            loadImage("https://1.bp.blogspot.com/-9MiK78CFMLM/YQFurOq9AII/AAAAAAAAQ1A/lKj5GiDnO_MkPLb72XqgnvD5uxOsHO-eACLcBGAsYHQ/s0/Android-Compose-1.0-header-v2.png")
        }

        binding.btnLoad2.setOnClickListener {
            loadImage("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgnaOlNifFoeziIpIYC9xaIUjKDPaW0Nz2r8joGDzZ-n9SF_2asQ3gz4HNh0q2uq1zGv8JTEyYMCbqg1y5DC9s5yp956B1OqI4-KPkN_v2XQ6vXnbC_KDS32wmj1BdiIb8vaZTdgSTMkgo0SkgtQUe0-HB4FN8ng7ZXOlWJrAMDWDGt67L0mm2F6NQp/w677-h202/image4.png")
        }
    }

    private fun loadImage(url: String) {
        Glide.with(this)
            .load(GlideUrlWithCacheKey(imageUrl = url, cacheKey = "TestSample"))
            .centerCrop()
            .addListener(LoggingListener<Drawable>())
            .into(binding.ivPreview)
    }
}


