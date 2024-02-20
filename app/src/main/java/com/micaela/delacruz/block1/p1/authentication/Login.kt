package com.ocampo.james.andrei.block1.p1.loginsignup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.ocampo.james.andrei.block1.p1.loginsignup.databinding.ActivityLoginBinding
import com.ocampo.james.andrei.block1.p1.loginsignup.databinding.ActivitySignupBinding

class Login : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    private lateinit var loguname: EditText
    private lateinit var logpassword: EditText
    private lateinit var loginButton: Button
    private lateinit var signup: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener(View.OnClickListener {
            val useredtx = loguname.text.toString()
            val passedtx = logpassword.text.toString()

            if (TextUtils.isEmpty(useredtx) || TextUtils.isEmpty(passedtx)){
                Toast.makeText(this, "Add Username and Password", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()

            }
        })

        val signup = findViewById<TextView>(R.id.signup)
        signup.setOnClickListener(){
            val intent = Intent(this, ActivitySignupBinding::class.java)
            startActivity(intent)
        }


    }
}