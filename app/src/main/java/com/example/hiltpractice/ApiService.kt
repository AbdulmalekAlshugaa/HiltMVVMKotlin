package com.example.hiltpractice


import retrofit2.Response
import retrofit2.http.*

interface ApiService{
    @GET("todos")
    suspend fun getJobs():Response<List<ResponseBodyJson>?>
}