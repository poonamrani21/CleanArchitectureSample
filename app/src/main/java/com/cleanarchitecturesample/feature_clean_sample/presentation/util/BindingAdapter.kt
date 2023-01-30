package com.cleanarchitecturesample.feature_clean_sample.presentation.util

import androidx.databinding.BindingAdapter
import coil.imageLoader
import coil.request.CachePolicy
import coil.request.ImageRequest
import com.cleanarchitecturesample.R
import com.google.android.material.imageview.ShapeableImageView
/***
 * Created by @author Poonam Rani by 18 Jan 2023
 */
@BindingAdapter("banner")
fun ShapeableImageView.banner(
    url: String?
) {
    url?.let {
        val imageLoader = context.imageLoader
        val request = ImageRequest.Builder(context)
            .data(it)
            .placeholder(R.drawable.ic_launcher_background)
            .error(R.drawable.ic_launcher_background)
            .target(this)
            .memoryCachePolicy(CachePolicy.DISABLED)
            .diskCachePolicy(CachePolicy.DISABLED)
            .build()
        imageLoader.enqueue(request)
    }
}
