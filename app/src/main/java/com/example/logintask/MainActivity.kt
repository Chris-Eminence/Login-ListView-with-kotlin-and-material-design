package com.example.logintask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    val userNameET = findViewById<EditText>(R.id.username_edit_text)
    val passwordET = findViewById<EditText>(R.id.password_edit_text)


    fun clickk(view: View) {

        if (loginFormValidation()){
            val intent = Intent(this, ListViewActivity::class.java)
            startActivity(intent)
        }

    }

    private fun loginFormValidation(): Boolean {

        if (userNameET.getText().toString().isEmpty()) {
            userNameET.error = "email should not be blank"
            return false
        } else if (passwordET.getText().toString().isEmpty()) {
            passwordET.error = "enter your password"
            return false
        }
        return true
    }
}