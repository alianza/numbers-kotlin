package com.example.numbers_kotlin.services

import retrofit2.Call
import retrofit2.http.GET
import com.example.numbers_kotlin.model.Trivia as Trivia1

interface NumbersApiService {
    // The GET method needed to retrieve a random number trivia.
    @GET("/random/trivia?json")
    fun getRandomNumberTrivia(): Call<Trivia1>
}
