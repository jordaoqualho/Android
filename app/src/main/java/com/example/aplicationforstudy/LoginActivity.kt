package com.example.aplicationforstudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.loginButton



class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        var user = findViewById<EditText>(R.id.usuario)

        back.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
        button2.setOnClickListener{
            Toast.makeText(applicationContext, "Usuario "+ user.text +" inválido!" , Toast.LENGTH_SHORT).show()
        }

    }
}