package com.example.carsonholzheimer.testlayoutstuff

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

        recyclerView = recyclerViewID
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MyAdapter()
        recyclerView.setHasFixedSize(true)
    }
}
