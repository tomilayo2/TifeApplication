package com.wtf.tifeapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val joinButton:Button = findViewById(R.id.joinNowButton)

        joinButton.setOnClickListener{
            //Navigate user to LoginActivity
            val intent = Intent(this, LoginActivity2::class.java)

            startActivity(intent)
        }
    }
}