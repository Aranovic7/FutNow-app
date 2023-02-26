package com.example.my_lab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.my_lab.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {



    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnNavigateToAboutActivity = binding.btnContinue
        val navigateToAbout = Intent(this, AboutActivity::class.java)
        btnNavigateToAboutActivity.setOnClickListener {
            startActivity(navigateToAbout)
        }
    }
}