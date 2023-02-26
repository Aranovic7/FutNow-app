package com.example.my_lab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LoggedInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logged_in)

        val myUsernameValue = intent.getStringExtra("username")
        val tv_displayUsername = "Hello $myUsernameValue"
        val displayUsername: TextView = findViewById(R.id.tv_greeting)
        displayUsername.setText(tv_displayUsername)

    }
}