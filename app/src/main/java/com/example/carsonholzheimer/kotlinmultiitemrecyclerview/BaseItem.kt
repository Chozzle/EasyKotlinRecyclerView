package com.example.carsonholzheimer.kotlinmultiitemrecyclerview

abstract class BaseItem(val layoutID: Int) {

    open fun bind(holder: CachingViewHolder, position: Int) {

    }
}