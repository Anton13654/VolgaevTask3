package com.aeincprojects.volgaevtask3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var namePlace: EditText
    private lateinit var nextButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        namePlace = findViewById(R.id.name_plainText)
        nextButton = findViewById(R.id.next_button)

        nextButton.setOnClickListener {
            val intent = Intent(this, NameActivity::class.java)
            intent.putExtra("Username", namePlace.text.toString())
            startActivity(intent)
        }
    }
}