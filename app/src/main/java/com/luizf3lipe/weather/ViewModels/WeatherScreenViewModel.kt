package com.luizf3lipe.weather.ViewModels

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.luizf3lipe.weather.network.KtorHttpClient
import com.luizf3lipe.weather.network.model.CurrentWeatherResult
import kotlinx.coroutines.launch

class WeatherScreenViewModel: ViewModel() {
    private val _currentWeather = mutableStateOf<Result<CurrentWeatherResult>>(Result.success(
        value = TODO()
    ))
    val currentWeather = _currentWeather.value

    init {
        viewModelScope.launch {
            _currentWeather.value = KtorHttpClient.getCurrentWeather()
        }
    }
}