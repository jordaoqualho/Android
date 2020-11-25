package com.example.aplicationforstudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginButton.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
        mapButton.setOnClickListener{
            startActivity(Intent(this, MapsActivity::class.java))
        }
    }
}