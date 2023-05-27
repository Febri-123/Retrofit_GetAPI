package com.example.retrogitapi

import retrofit2.Call
import retrofit2.http.GET

interface APIServices {
    @GET("datamahasiswa/")
    fun getdatamahasiswa(): Call<ApiResponse>
}
