package com.applecompose.goldapi.model

data class Gold(
    val base: String,
    val date: String,
    val rates: Rates,
    val success: Boolean,
    val timestamp: Int,
    val unit: String
)