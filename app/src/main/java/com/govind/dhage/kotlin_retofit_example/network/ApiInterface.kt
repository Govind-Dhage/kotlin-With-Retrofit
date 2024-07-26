package com.govind.dhage.kotlin_retofit_example.network

import com.govind.dhage.kotlin_retofit_example.ResponseListUsers
import retrofit2.Response
import retrofit2.http.GET


interface ApiInterface {
    @GET("/api/users?page=2")
    suspend fun getAllUsers(): Response<ResponseListUsers>
}