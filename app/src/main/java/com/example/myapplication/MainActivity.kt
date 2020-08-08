package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var viewAdapter: ToDoRecylerViewAdapter
    lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycler_view)
        viewAdapter = ToDoRecylerViewAdapter()
        viewManager = LinearLayoutManager(this) // TODO こいつ調べる　
        recyclerView.adapter = viewAdapter
        recyclerView.layoutManager = viewManager
    }
}