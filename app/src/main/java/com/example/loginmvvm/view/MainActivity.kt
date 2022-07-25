package com.example.loginmvvm.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.loginmvvm.R
import com.example.loginmvvm.databinding.ActivityMainBinding
import com.example.loginmvvm.viewmodel.LoginViewModel

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    val loginViewModel = LoginViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            var userName = binding.edtUsername.text.toString().trim()
            var password = binding.edtPassword.text.toString().trim()
            loginViewModel.checkingLogin(userName,password)
        }
        loginViewModel.loginEvent.observe(this){
            val status = it.status
            if (status == 1){
                val intent = Intent(Intent(this, HomeActivity::class.java))
                startActivity(intent)
            }else{
                Toast.makeText(this, "salaah password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}