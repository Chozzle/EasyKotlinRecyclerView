package com.example.carsonholzheimer.kotlinmultiitemrecyclerview

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.support.annotation.LayoutRes


class MyAdapter(val myData: MutableList<BaseItem>) : RecyclerView.Adapter<BaseViewHolder>() {


    private var lastItemForViewTypeLookup: BaseItem? = null

    override fun onCreateViewHolder(parent: ViewGroup, layoutResId: Int): BaseViewHolder {
        val item = getItemForViewType(layoutResId)
        val itemView = LayoutInflater.from(parent.context).inflate(layoutResId, parent, false)
        return item.createViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) = myData[position].bind(holder, position)

    override fun getItemCount(): Int = myData.size

    override fun getItemViewType(position: Int): Int {
        lastItemForViewTypeLookup = myData[position]
        return myData[position].layoutID
    }

    private fun getItemForViewType(@LayoutRes layoutResId: Int): BaseItem {
        lastItemForViewTypeLookup?.let {
            if (it.layoutID == layoutResId) {
                return it
            }
        }

        myData.forEach {
            if (it.layoutID == layoutResId) {
                return it
            }
        }

        throw IllegalStateException("Could not find model for view type: $layoutResId")
    }
}
