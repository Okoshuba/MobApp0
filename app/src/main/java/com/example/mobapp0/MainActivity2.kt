package com.example.mobapp0

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity2 : AppCompatActivity() {

    companion object{
        const val TOTAL_COUNT = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        showRandomCount()
    }

    fun showRandomCount(){
        val textView: TextView = findViewById(R.id.textView2)
        val count = intent.getIntExtra(TOTAL_COUNT, 0)
        val random = Random()
        var randomInt = 0

        if (count > 0)
            randomInt = random.nextInt(count + 1)

        textView.text = randomInt.toString()
    }
}