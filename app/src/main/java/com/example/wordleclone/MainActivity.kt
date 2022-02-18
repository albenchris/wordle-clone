package com.example.wordleclone

import android.annotation.SuppressLint
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.core.content.ContextCompat

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

    lateinit var row1 : List<TextView>
    lateinit var row2 : List<TextView>
    lateinit var row3 : List<TextView>
    lateinit var row4 : List<TextView>
    lateinit var row5 : List<TextView>
    lateinit var row6 : List<TextView>

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

        row1 = arrayListOf<TextView>(r1c1, r1c2, r1c3, r1c4, r1c5)
        row2 = arrayListOf<TextView>(r2c1, r2c2, r2c3, r2c4, r2c5)
        row3 = arrayListOf<TextView>(r3c1, r3c2, r3c3, r3c4, r3c5)
        row4 = arrayListOf<TextView>(r4c1, r4c2, r4c3, r4c4, r4c5)
        row5 = arrayListOf<TextView>(r5c1, r5c2, r5c3, r5c4, r5c5)
        row6 = arrayListOf<TextView>(r6c1, r6c2, r6c3, r6c4, r6c5)

        // testing TextView background color changes
        var word = "words"
        var wordIndex = 0
        while (wordIndex < word.length) {
            row1[wordIndex].text = word[wordIndex].toString()
            row1[wordIndex].background = ContextCompat.getDrawable(this, R.drawable.text_correct)
            wordIndex++
        }



        val q : TextView = findViewById(R.id.btnQ)
        val w : TextView = findViewById(R.id.btnW)
        val e : TextView = findViewById(R.id.btnE)
        val r : TextView = findViewById(R.id.btnR)
        val t : TextView = findViewById(R.id.btnT)
        val y : TextView = findViewById(R.id.btnY)
        val u : TextView = findViewById(R.id.btnU)
        val i : TextView = findViewById(R.id.btnI)
        val o : TextView = findViewById(R.id.btnO)
        val p : TextView = findViewById(R.id.btnP)

        val a : TextView = findViewById(R.id.btnA)
        val s : TextView = findViewById(R.id.btnS)
        val d : TextView = findViewById(R.id.btnD)
        val f : TextView = findViewById(R.id.btnF)
        val g : TextView = findViewById(R.id.btnG)
        val h : TextView = findViewById(R.id.btnH)
        val j : TextView = findViewById(R.id.btnJ)
        val k : TextView = findViewById(R.id.btnK)
        val l : TextView = findViewById(R.id.btnL)

        val z : TextView = findViewById(R.id.btnZ)
        val x : TextView = findViewById(R.id.btnX)
        val c : TextView = findViewById(R.id.btnC)
        val v : TextView = findViewById(R.id.btnV)
        val b : TextView = findViewById(R.id.btnB)
        val n : TextView = findViewById(R.id.btnN)
        val m : TextView = findViewById(R.id.btnM)

        var lettersIndex = 0
        val letters = arrayListOf<TextView>(
            q,w,e,r,t,y,u,i,o,p,
            a,s,d,f,g,h,j,k,l,
            z,x,c,v,b,n,m
        )
        while (lettersIndex < letters.size) {
            val letter : String = letters[lettersIndex].text as String
            letters[lettersIndex].setOnClickListener {
                typeLetter(letter)
            }
            lettersIndex++
        }

    }

    fun typeLetter(letter: String) {
        Toast.makeText(this, letter, Toast.LENGTH_SHORT).show()
    }


}