package com.example.sampleapp.data.remote

import com.example.sampleapp.data.remote.dto.CoinDetailDto
import com.example.sampleapp.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

interface Api {
    @GET("/v1/coins")
    suspend fun getCoins() : List<CoinDto>

    @GET("/v1/coins/{coinId}")
    suspend fun  getCoinById(@Path("coinId") coinId: String):CoinDetailDto
}