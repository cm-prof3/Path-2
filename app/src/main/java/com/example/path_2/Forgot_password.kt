package com.example.path_2                                                                          ////Тамбовцева К., 26.03.2024

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Forgot_password : AppCompatActivity() {                                                       //сброс пароля
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_forgot_password)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets


            val signin: TextView =findViewById(R.id.sign_in)                                        //переход на страницу регистрации
            signin.setOnClickListener{
                val intent: Intent(this, activity_sign_in::class.java)
                startActivity(intent)

            }

            val send: TextView =findViewById(R.id.sendotp)                                          //получение пользователем кода подтверждения
            send.setOnClickListener{
                val intent: Intent(this, activity_sign_in::class.java)
                startActivity(intent)
        }
    }


    }
}