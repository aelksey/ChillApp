package com.example.chillapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        // TODO: Create login functionality whentever user presses button log as guest or enters hardcoded login and password
        // ELSE: Display push notification that password is incorrect
        val loginEd = findViewById<EditText>(R.id.editTextText2) as EditText
        val passwordEd = findViewById<EditText>(R.id.editTextTextPassword2) as EditText
        val loginBtn = findViewById<Button>(R.id.button4) as Button
        val GuestBtn = findViewById<Button>(R.id.button2) as Button
        // To change password and login look in strings.xml
        loginBtn?.setOnClickListener(){
            Login(loginEd,passwordEd)
        }
        GuestBtn?.setOnClickListener(){
            GuestLogin()
        }

    }

    fun Login(login: EditText,password: EditText){
        if(login.text.toString() == applicationContext.getString(R.string.login) && password.text.toString() == applicationContext.getString(R.string.password)){startActivity(
            Intent(this,MainActivity::class.java)
        )}
        else{
            Toast.makeText(this, R.string.login_error, Toast.LENGTH_LONG).show()
        }

    }

    fun GuestLogin(){startActivity(Intent(this,MainActivity::class.java))
    }
}