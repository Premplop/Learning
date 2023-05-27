package com.example.sampleapp.domain.repository

import com.example.sampleapp.data.remote.dto.CoinDetailDto
import com.example.sampleapp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}