package com.example.loginmvvm.repository

import com.example.loginmvvm.model.LoginResponse
import retrofit2.Call

interface Repository {

    fun checkingLogin(userName : String, pasword : String) : Call<LoginResponse>
}