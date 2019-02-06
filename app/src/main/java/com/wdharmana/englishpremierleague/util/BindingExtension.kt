package com.wdharmana.englishpremierleague.util

import android.databinding.BindingAdapter
import android.view.View
import android.widget.ImageView

class BindingExtension {
    companion object {
        @JvmStatic
        @BindingAdapter("visibleGone")
        fun showHide(view: View, show: Boolean) {
            view.visibility = if (show) View.VISIBLE else View.GONE
        }

        @JvmStatic
        @BindingAdapter("android:src")
        fun setImageUrl(view: ImageView, url: String) {
            GlideApp.with(view.context)
                    .asBitmap()
                    .centerCrop()
                    .load(url)
                    .into(view)
        }

    }
}