package com.example.carsonholzheimer.kotlinmultiitemrecyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Create some example data
        val myData = mutableListOf<BaseItem>()
        var letter = 'A'
        (0..500).forEach {
            myData.add(HeaderItem(letter))

            if (letter.toInt() < 'Z'.toInt()) {
                letter++
            } else {
                letter = 'A'
                myData.add(ButtonItem())
            }
            myData.add(ImageItem(ImageItem.Mode.MARGIN_RIGHT))
            myData.add(ImageItem(ImageItem.Mode.MARGIN_LEFT))
        }

        recyclerView = recyclerViewID
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MyAdapter(myData)
        recyclerView.setHasFixedSize(true)
    }
}
