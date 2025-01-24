package com.example.box_exeted

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        boxer()
    }

    private fun boxer(){
        val mainBox = Box(10)

        val secondBox = SuperBox(5)

        secondBox.getAnotherBox(mainBox)

        println(secondBox.getInfo())
    }
}