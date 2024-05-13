package com.example.myweatherapp

data class DayItem(
    val city: String,
    val data: String,
    val condition: String,
    val imageUrl: String,
    val currentTemp: String,
    val maxTemp: String,
    val minTemp: String,
    val horus: String
)
