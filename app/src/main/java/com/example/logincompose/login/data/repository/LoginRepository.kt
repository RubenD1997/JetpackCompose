package com.example.logincompose.login.data.repository

import com.example.logincompose.login.data.network.LoginService

class LoginRepository {

    private val api = LoginService()

    suspend fun doLogin(user: String, password: String): Boolean {
        return api.doLogin(user, password)
    }
}