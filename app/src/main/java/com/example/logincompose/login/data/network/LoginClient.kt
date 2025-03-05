package com.example.logincompose.login.data.network

import com.example.logincompose.login.data.network.response.LoginResponse
import retrofit2.Response
import retrofit2.http.GET

interface LoginClient {
    @GET("/v3/dbf20c37-5e3b-4a7e-95e9-0326442965cb")
    suspend fun doLogin(): Response<LoginResponse>
}