package com.example.path_2                                                                          //Тамбовцева К., 26.03.2024

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Sign_in : AppCompatActivity() {                                                               //страница входа
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_in)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    val forgotPassword: TextView =findViewById(R.id.forgot)                                         //переход на страницу сброса пароля
    signup.setOnClickListener{
        val intent: Intent(this, activity_forgot_password::class.java)
        startActivity(intent)

    }
    val log_in: TextView =findViewById(R.id.login)                                                  //вход пользователя и переход на домашний экран
    signup.setOnClickListener{
        val intent: Intent(this, activity_home::class.java)
        startActivity(intent)

    }
    val signup: TextView =findViewById(R.id.sign_up)                                                //переход на страницу регистрации
    signup.setOnClickListener{
        val intent: Intent(this, activity_main::class.java)
        startActivity(intent)

    }
}