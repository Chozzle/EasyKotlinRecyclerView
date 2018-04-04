package com.example.carsonholzheimer.kotlinmultiitemrecyclerview

import android.support.annotation.LayoutRes
import android.view.View

abstract class BaseItem(@LayoutRes open val layoutID: Int) {

    abstract fun bind(holder: BaseViewHolder, position: Int)

    open fun createViewHolder(view: View) = BaseViewHolder(view)
}