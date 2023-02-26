package com.example.my_lab

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.app.TaskStackBuilder
import com.google.android.material.textfield.TextInputEditText

class SignInActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        var users = ArrayList<User>( //Fördefinerad array (user account)
            listOf(
                User(
                    "Aran",
                    "ali123"
                )
            )
        )

        //TODO - fix binding here also
        val alertMessage: AlertDialog.Builder = AlertDialog.Builder(this)
        val passwordInput: TextInputEditText = findViewById(R.id.et_passwordInput)
        val usernameInput: TextInputEditText = findViewById(R.id.et_usernameInput)
        val btnNavigateToLoggedInActivity: Button = findViewById(R.id.btn_myLogInButton)


        btnNavigateToLoggedInActivity.setOnClickListener {
            if (usernameInput.text.toString() != users[0].username || passwordInput.text.toString() != users[0].password){
                alertMessage.setTitle("Error")
                    .setMessage("Please, try again. Username or password did not match")
                    .setPositiveButton("OK"){dialog,which ->

                    }
                val dialog = alertMessage.create()
                dialog.show()
            }  else {
                val navigateToLoggedIn = Intent(this, LoggedInActivity::class.java).apply {
                    putExtra("username", usernameInput.text.toString())
                }
                startActivity(navigateToLoggedIn)
            }

        }


    }
}
