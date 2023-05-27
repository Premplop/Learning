package com.example.sampleapp.data.remote.dto

import com.example.sampleapp.domain.model.Coin

//use to get from api and send to Coin Model in Domain
data class CoinDto(
    val id: String,
    val is_active: Boolean,
    val is_new: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
    val type: String
)

fun CoinDto.toCoin(): Coin{
    return Coin(
        id = id,
        is_active =is_active,
        name = name,
        rank = rank,
        symbol = symbol
    )
}