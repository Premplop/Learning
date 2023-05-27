package com.example.sampleapp.domain.model

import com.example.sampleapp.data.remote.dto.TeamMemeber

data class CoinDetail(
    val coinId: String,
    val name: String,
    val logo: String,
    val description: String,
    val symbol: String,
    val rank: Int,
    val is_active: Boolean,
    val tags: List<String>,
    val team: List<TeamMemeber>
)
