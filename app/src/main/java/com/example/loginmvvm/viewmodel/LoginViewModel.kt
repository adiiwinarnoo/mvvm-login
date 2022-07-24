package com.example.loginmvvm.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.loginmvvm.model.LoginResponse
import com.example.loginmvvm.network.ApiRetrofit
import com.example.loginmvvm.repository.Repo
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginViewModel : ViewModel() {

    val apiRetrofit = Repo()

    val loginEvent: MutableLiveData<LoginResponse> = MutableLiveData()

    fun checkingLogin(userName : String, password : String) : LiveData<LoginResponse>{
        apiRetrofit.checkingLogin(userName,password).enqueue(object : Callback<LoginResponse>{
            override fun onResponse(call: Call<LoginResponse>, response: Response<LoginResponse>) {
                if (response.isSuccessful){
                    if (response.body()?.status == 1){
                        if (response.body()?.dataLogin != null){
                            Log.d("login-response", "onResponse: Berhasil")
                        }
                    }
                }
            }

            override fun onFailure(call: Call<LoginResponse>, t: Throwable) {
                Log.d("login-response", "onResponse: gagal ${t.message.toString()}")
            }

        })

        return loginEvent
    }
}