package com.example.wordleclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.GridView
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {

//    lateinit var gameBoardRow1 : GridView
//    lateinit var gameBoardRow2 : GridView
//    lateinit var gameBoardRow3 : GridView
//    lateinit var gameBoardRow4 : GridView
//    lateinit var gameBoardRow5 : GridView
//    lateinit var gameBoardRow6 : GridView

    lateinit var gameBoardRow1 : LinearLayout
    lateinit var gameBoardRow2 : LinearLayout
    lateinit var gameBoardRow3 : LinearLayout
    lateinit var gameBoardRow4 : LinearLayout
    lateinit var gameBoardRow5 : LinearLayout
    lateinit var gameBoardRow6 : LinearLayout


    var row1 = arrayListOf<String>("L", "A", "T", "E", "R")
    var row2 = arrayListOf<String>("T", "H", "O", "S", "E")
    var row3 = arrayListOf<String>(" ", " ", " ", " ", " ")
    var row4 = arrayListOf<String>(" ", " ", " ", " ", " ")
    var row5 = arrayListOf<String>(" ", " ", " ", " ", " ")
    var row6 = arrayListOf<String>(" ", " ", " ", " ", " ")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gameBoardRow1 = findViewById(R.id.gameBoardRow1)
        gameBoardRow2 = findViewById(R.id.gameBoardRow2)
        gameBoardRow3 = findViewById(R.id.gameBoardRow3)
        gameBoardRow4 = findViewById(R.id.gameBoardRow4)
        gameBoardRow5 = findViewById(R.id.gameBoardRow5)
        gameBoardRow6 = findViewById(R.id.gameBoardRow6)

//        var adapter: ArrayAdapter<String> = ArrayAdapter(this, R.layout.grid_item, R.id.gridText, row1)
//        gameBoardRow1.adapter = adapter
//
//        adapter = ArrayAdapter(this, R.layout.grid_item, R.id.gridText, row2)
//        gameBoardRow2.adapter = adapter
//
//        adapter = ArrayAdapter(this, R.layout.grid_item, R.id.gridText, row3)
//        gameBoardRow3.adapter = adapter
//
//        adapter = ArrayAdapter(this, R.layout.grid_item, R.id.gridText, row4)
//        gameBoardRow4.adapter = adapter
//
//        adapter = ArrayAdapter(this, R.layout.grid_item, R.id.gridText, row5)
//        gameBoardRow5.adapter = adapter
//
//        adapter = ArrayAdapter(this, R.layout.grid_item, R.id.gridText, row6)
//        gameBoardRow6.adapter = adapter


        // testing TextView background color changes


    }


}