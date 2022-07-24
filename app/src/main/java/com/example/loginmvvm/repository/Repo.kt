package com.example.loginmvvm.repository

import com.example.loginmvvm.model.LoginResponse
import com.example.loginmvvm.network.ApiRetrofit
import com.example.loginmvvm.network.ApiService
import retrofit2.Call

class Repo : Repository {
    override fun checkingLogin(userName: String, pasword: String): Call<LoginResponse> {
        return ApiRetrofit.service.loginUser(userName,pasword)
    }
}