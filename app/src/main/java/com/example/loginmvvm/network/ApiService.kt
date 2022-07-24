package com.example.loginmvvm.network

import com.example.loginmvvm.model.LoginResponse
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface ApiService {

    @FormUrlEncoded
    @POST("api/login")
    fun loginUser(
        @Field("username") username : String,
        @Field("password") password : String
    ):Call<LoginResponse>
}