package com.example.sampleapp.domain.model

import com.example.sampleapp.data.remote.dto.CoinDto

//use to get data from CoinDto and use in Presentation
data class Coin(
    val id: String,
    val is_active: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
)

