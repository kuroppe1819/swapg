package com.swapg.kuroppe.swapg.util

import android.databinding.BindingAdapter
import android.widget.ImageView
import com.squareup.picasso.Picasso
import com.swapg.kuroppe.swapg.R

object ViewModelBindings {

    @JvmStatic
    @BindingAdapter("loadImage")
    fun loadImage(imageView: ImageView, imageUrl: String) {
        Picasso.with(imageView.context)
                .load(imageUrl)
                .error(R.mipmap.ic_launcher)
                .into(imageView)
    }
}