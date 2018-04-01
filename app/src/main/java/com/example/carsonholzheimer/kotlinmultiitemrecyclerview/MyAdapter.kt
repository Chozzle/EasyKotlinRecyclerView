package com.example.carsonholzheimer.kotlinmultiitemrecyclerview

import android.support.annotation.LayoutRes
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup


class MyAdapter : RecyclerView.Adapter<CachingViewHolder>() {

    private val myData = mutableListOf<BaseItem>()

    init {
        // Create some example data
        var letter = 'A'
        (0..500).forEach {
            myData.add(HeaderItem(letter, R.layout.item_header))

            if (letter.toInt() < 'Z'.toInt()) {
                letter++
            } else {
                letter = 'A'
            }
            myData.add(ImageItem(R.layout.item_image))
            myData.add(ImageItem(R.layout.item_image))
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, layoutResId: Int): CachingViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val itemView = inflater.inflate(layoutResId, parent, false)
        return CachingViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CachingViewHolder, position: Int) {
        myData[position].bind(holder, position)
    }

    override fun getItemCount(): Int {
        return myData.size
    }

    override fun getItemViewType(position: Int): Int {
        return myData[position].layoutID

    }
}