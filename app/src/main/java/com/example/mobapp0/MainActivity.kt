package com.example.mobapp0

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(view: View){
        val toast = Toast.makeText(this, "Hello!", Toast.LENGTH_SHORT)
        toast.show()
    }

    fun countMe(view: View){
        val textView: TextView = findViewById(R.id.textView)
        val countElement = textView.text.toString()

        var count: Int = Integer.parseInt(countElement)
        count++

        textView.text = count.toString()
    }

    fun randomMe(view: View){
        val textView: TextView = findViewById(R.id.textView)
        val randomIntent = Intent(this, MainActivity2::class.java)
        val count = Integer.parseInt(textView.text.toString())
        randomIntent.putExtra(MainActivity2.TOTAL_COUNT, count)
        startActivity(randomIntent)
    }
}