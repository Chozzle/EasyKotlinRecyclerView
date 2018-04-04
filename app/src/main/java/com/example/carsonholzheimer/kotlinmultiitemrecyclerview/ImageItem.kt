package com.example.carsonholzheimer.kotlinmultiitemrecyclerview

import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_image.*

class ImageItem(val mode: Mode) : BaseItem(R.layout.item_image) {
    override val layoutID: Int
        get() {
            return when (mode) {
                ImageItem.Mode.MARGIN_RIGHT -> R.layout.item_image_margin_right
                else -> super.layoutID
            }
        }

    enum class Mode {
        MARGIN_LEFT,
        MARGIN_RIGHT
    }

    override fun bind(holder: BaseViewHolder, position: Int) {
        Picasso.get().load("https://placem.at/places?w=600&h=100&random=$position&txt=0").into(holder.imageId)
    }
}