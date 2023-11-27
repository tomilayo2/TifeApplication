package com.wtf.tifeapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar

class LoginActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)

        val createNAButton: Button = findViewById(R.id.createAccount)

        createNAButton.setOnClickListener {
            //Navigate user to LoginActivity
            val intent = Intent(this, CreateNewAccountActivity2::class.java)

            startActivity(intent)
        }

        val forgotpasswordButton: Button = findViewById(R.id.forgottenPassword)

        forgotpasswordButton.setOnClickListener {
            //Navigate user to LoginActivity
            val intent = Intent(this, ForgottenPasswordMainActivity2::class.java)

            startActivity(intent)
        }

        val loginButton: Button = findViewById(R.id.login)
        val usernameEdt: EditText = findViewById(R.id.username)
        val passwordEdt: EditText = findViewById(R.id.password)

        loginButton.setOnClickListener {
            val userUsernameEntered:String=usernameEdt.text.toString()
            val userPasswordEntered:String=passwordEdt.text.toString()
            var message="";
            if(userUsernameEntered.isEmpty() && userPasswordEntered.isEmpty()){
                message = "You need to input a username and password";
            }else{
                if(userUsernameEntered.isEmpty()){
                    message = "You need to input a username"
                }else{
                    if(userPasswordEntered.isEmpty()){
                        message = "You need to input a password"
                    }else{
                        val i = Intent(this, HomeMainActivity2:: class.java)
                        startActivity(i)
                    }
                }

            }
            Snackbar
                .make(
                    findViewById(R.id.login),
                    message,
                    Snackbar.LENGTH_LONG)
                .show()
        }


    }
}