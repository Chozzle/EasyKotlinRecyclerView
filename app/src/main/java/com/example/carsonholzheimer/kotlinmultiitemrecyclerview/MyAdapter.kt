package com.example.carsonholzheimer.kotlinmultiitemrecyclerview

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

class MyAdapter(val myData: MutableList<BaseItem>) : RecyclerView.Adapter<CachingViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, layoutResId: Int): CachingViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(layoutResId, parent, false)
        return CachingViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CachingViewHolder, position: Int) = myData[position].bind(holder, position)

    override fun getItemCount(): Int = myData.size

    override fun getItemViewType(position: Int): Int = myData[position].layoutID
}