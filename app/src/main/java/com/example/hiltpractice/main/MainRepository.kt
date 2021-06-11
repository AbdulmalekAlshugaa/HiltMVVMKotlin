package com.example.hiltpractice.main

import okhttp3.ResponseBody

interface MainRepository {
//
    suspend fun getToDoList () : ResponseBody
}