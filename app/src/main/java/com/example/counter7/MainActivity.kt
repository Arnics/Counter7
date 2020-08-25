package com.example.counter7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.myBtn)  // panemam ID pogai ir case sensitive
        val textView: TextView = findViewById(R.id.myText) // panemt ID tekstam ir case sensitive

        var counter = 0 // sakuma vertiba

        button.setOnClickListener { // jabut noradits ka val ar to pasu case sensitive
            counter++
            textView.text = "kliki $counter" // rezultata izvade, sakumam jabut ka val noradits tas ir svarigi
        }

    }
}