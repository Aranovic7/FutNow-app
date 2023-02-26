package com.example.my_lab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.my_lab.databinding.ActivityAboutBinding


class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about2)



        //TODO fix binding here too, like in mainActivity
        val btnNavigateToSignInActivity: Button = findViewById(R.id.btn_logIn)
        val navigateToSignIN = Intent(this, SignInActivity::class.java)

        btnNavigateToSignInActivity.setOnClickListener {
            startActivity(navigateToSignIN)
        }
    }
}