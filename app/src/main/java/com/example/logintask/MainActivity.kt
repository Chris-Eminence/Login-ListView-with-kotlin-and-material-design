package com.example.logintask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var username_edit_text : EditText
    private lateinit var password_edit_text : EditText
    private lateinit var login_btn : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        username_edit_text = findViewById(R.id.username_edit_text)
        password_edit_text = findViewById(R.id.password_edit_text)
        login_btn = findViewById(R.id.login_btn)

        login_btn.setOnClickListener {
            val emailAddress = username_edit_text.text.toString().trim()
            val password_ = password_edit_text.text.toString().trim()

            if (emailAddress.isEmpty()){
                username_edit_text.error = "Email address Required"
                return@setOnClickListener
            }
            else if (password_.isEmpty()){
                password_edit_text.error = "Password Required"
                return@setOnClickListener
            }else{
                val intent = Intent(this, ListViewActivity::class.java)
                startActivity(intent)
            }
        }

    }
}