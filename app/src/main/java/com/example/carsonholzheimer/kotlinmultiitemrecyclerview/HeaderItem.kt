package com.example.carsonholzheimer.kotlinmultiitemrecyclerview

import kotlinx.android.synthetic.main.item_header.*

class HeaderItem(val letter: Char, layoutId: Int) : BaseItem(layoutId) {

    override fun bind(holder: CachingViewHolder, position: Int) {

        holder
        holder.textId.text = letter.toString()
    }
}