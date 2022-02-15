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

    //    var row1 = arrayListOf<String>("L", "A", "T", "E", "R")
//    var row2 = arrayListOf<String>("T", "H", "O", "S", "E")
//    var row3 = arrayListOf<String>(" ", " ", " ", " ", " ")
//    var row4 = arrayListOf<String>(" ", " ", " ", " ", " ")
//    var row5 = arrayListOf<String>(" ", " ", " ", " ", " ")
//    var row6 = arrayListOf<String>(" ", " ", " ", " ", " ")


    lateinit var gameBoardRow1 : LinearLayout
    lateinit var gameBoardRow2 : LinearLayout
    lateinit var gameBoardRow3 : LinearLayout
    lateinit var gameBoardRow4 : LinearLayout
    lateinit var gameBoardRow5 : LinearLayout
    lateinit var gameBoardRow6 : LinearLayout

    lateinit var r1c1 : TextView
    lateinit var r1c2 : TextView
    lateinit var r1c3 : TextView
    lateinit var r1c4 : TextView
    lateinit var r1c5 : TextView

    lateinit var r2c1 : TextView
    lateinit var r2c2 : TextView
    lateinit var r2c3 : TextView
    lateinit var r2c4 : TextView
    lateinit var r2c5 : TextView

    lateinit var r3c1 : TextView
    lateinit var r3c2 : TextView
    lateinit var r3c3 : TextView
    lateinit var r3c4 : TextView
    lateinit var r3c5 : TextView

    lateinit var r4c1 : TextView
    lateinit var r4c2 : TextView
    lateinit var r4c3 : TextView
    lateinit var r4c4 : TextView
    lateinit var r4c5 : TextView

    lateinit var r5c1 : TextView
    lateinit var r5c2 : TextView
    lateinit var r5c3 : TextView
    lateinit var r5c4 : TextView
    lateinit var r5c5 : TextView

    lateinit var r6c1 : TextView
    lateinit var r6c2 : TextView
    lateinit var r6c3 : TextView
    lateinit var r6c4 : TextView
    lateinit var r6c5 : TextView

    var row1 = arrayListOf<TextView>(r1c1, r1c2, r1c3, r1c4, r1c5)
    var row2 = arrayListOf<TextView>(r2c1, r2c2, r2c3, r2c4, r2c5)
    var row3 = arrayListOf<TextView>(r3c1, r3c2, r3c3, r3c4, r3c5)
    var row4 = arrayListOf<TextView>(r4c1, r4c2, r4c3, r4c4, r4c5)
    var row5 = arrayListOf<TextView>(r5c1, r5c2, r5c3, r5c4, r5c5)
    var row6 = arrayListOf<TextView>(r6c1, r6c2, r6c3, r6c4, r6c5)



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gameBoardRow1 = findViewById(R.id.gameBoardRow1)
        gameBoardRow2 = findViewById(R.id.gameBoardRow2)
        gameBoardRow3 = findViewById(R.id.gameBoardRow3)
        gameBoardRow4 = findViewById(R.id.gameBoardRow4)
        gameBoardRow5 = findViewById(R.id.gameBoardRow5)
        gameBoardRow6 = findViewById(R.id.gameBoardRow6)

        r1c1 = findViewById(R.id.r1c1)
        r1c2 = findViewById(R.id.r1c2)
        r1c3 = findViewById(R.id.r1c3)
        r1c4 = findViewById(R.id.r1c4)
        r1c5 = findViewById(R.id.r1c5)

        r2c1 = findViewById(R.id.r2c1)
        r2c2 = findViewById(R.id.r2c2)
        r2c3 = findViewById(R.id.r2c3)
        r2c4 = findViewById(R.id.r2c4)
        r2c5 = findViewById(R.id.r2c5)

        r3c1 = findViewById(R.id.r3c1)
        r3c2 = findViewById(R.id.r3c2)
        r3c3 = findViewById(R.id.r3c3)
        r3c4 = findViewById(R.id.r3c4)
        r3c5 = findViewById(R.id.r3c5)

        r4c1 = findViewById(R.id.r4c1)
        r4c2 = findViewById(R.id.r4c2)
        r4c3 = findViewById(R.id.r4c3)
        r4c4 = findViewById(R.id.r4c4)
        r4c5 = findViewById(R.id.r4c5)

        r5c1 = findViewById(R.id.r5c1)
        r5c2 = findViewById(R.id.r5c2)
        r5c3 = findViewById(R.id.r5c3)
        r5c4 = findViewById(R.id.r5c4)
        r5c5 = findViewById(R.id.r5c5)

        r6c1 = findViewById(R.id.r6c1)
        r6c2 = findViewById(R.id.r6c2)
        r6c3 = findViewById(R.id.r6c3)
        r6c4 = findViewById(R.id.r6c4)
        r6c5 = findViewById(R.id.r6c5)

        // testing TextView background color changes
//        var word = "later"
//
//        var i = 0
//        while (i < word.length) {
//
//            i++
//        }

    }


}