package com.aeincprojects.volgaevtask3

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class NameActivity : AppCompatActivity() {

    private lateinit var helloText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)
        helloText = findViewById(R.id.name_Text)

        val name = intent.getStringExtra("Username")
        helloText.text = "Hello $name"
    }
}