package com.example.carsonholzheimer.kotlinmultiitemrecyclerview

import kotlinx.android.synthetic.main.item_header.*

class HeaderItem(val letter: Char) : BaseItem(R.layout.item_header) {

    override fun bind(holder: BaseViewHolder, position: Int) {
        holder.textId.text = letter.toString()
    }
}