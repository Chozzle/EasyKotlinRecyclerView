package com.example.carsonholzheimer.kotlinmultiitemrecyclerview

import android.view.View
import kotlinx.android.synthetic.main.item_button.*

class ButtonItem : BaseItem(R.layout.item_button) {

    override fun bind(holder: BaseViewHolder, position: Int) {
        holder.buttonID.setOnClickListener {

        }
    }

    override fun createViewHolder(view: View): BaseViewHolder {
        val viewHolder = BaseViewHolder(view)
        viewHolder.buttonID.setOnClickListener {
            //clickListener.onButtonItemClicked()
        }
        return viewHolder
    }

    interface ButtonClickListener {
        fun onButtonItemClicked()
    }
}
