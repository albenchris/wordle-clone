package com.example.wordleclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.GridView
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var gameBoardRow1 : GridView
    lateinit var gridItem : TextView

    var row1 = arrayListOf<String>("L", "A", "T", "E", "R")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gameBoardRow1 = findViewById(R.id.gameBoardRow1)


        var adapter: ArrayAdapter<String> = ArrayAdapter(this, R.layout.grid_item, R.id.gridText, row1)

        gameBoardRow1.adapter = adapter
    }
}