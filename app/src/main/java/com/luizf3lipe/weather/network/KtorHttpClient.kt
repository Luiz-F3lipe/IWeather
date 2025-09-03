package com.luizf3lipe.weather.network

import com.luizf3lipe.weather.network.model.CurrentWeatherResult
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.engine.android.Android
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.request.get
import io.ktor.serialization.kotlinx.json.json

object KtorHttpClient {
    private const val BASE_URL = "https://api.openweathermap.org/data/2.5"
    private const val LAT = "-27.8167"
    private const val LON = "-50.3264"

    val client = HttpClient(Android) {
        install(Logging)
        install(ContentNegotiation) {
            json()
        }
    }

    suspend fun getCurrentWeather(): Result<CurrentWeatherResult> {
        return requireGet(url = "$BASE_URL/weather?lat=$LAT&lon=$LON")
    }

    private suspend inline fun <reified T> requireGet(url: String): Result<T> {
        return try {
            Result.success(client.get(url).body())
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}