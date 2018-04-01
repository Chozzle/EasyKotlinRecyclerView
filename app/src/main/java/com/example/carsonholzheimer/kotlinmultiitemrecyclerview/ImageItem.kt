package com.example.carsonholzheimer.kotlinmultiitemrecyclerview

import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_image.*

class ImageItem(layoutId: Int) : BaseItem(layoutId) {

    override fun bind(holder: CachingViewHolder, position: Int) {
        Picasso.get().load("https://placem.at/places?w=600&h=100&random=$position&txt=0").into(holder.imageId)
    }

}