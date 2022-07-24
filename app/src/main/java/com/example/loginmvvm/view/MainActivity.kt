package com.example.loginmvvm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
    }
}