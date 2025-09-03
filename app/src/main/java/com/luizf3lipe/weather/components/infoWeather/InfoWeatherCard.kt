package com.luizf3lipe.weather.components.infoWeather

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.luizf3lipe.weather.R
import com.luizf3lipe.weather.ui.theme.Gray700
import com.luizf3lipe.weather.ui.theme.Gray800
@Composable
fun InfoWeatherCard(modifier: Modifier = Modifier) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Gray800),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            InfoWeatherItem(
                label = "Sensação térmica",
                iconRes = R.drawable.ic_temperature,
                temperature = "28ºc"
            )
            HorizontalDivider(
                color = Gray700,
                modifier = Modifier.padding(vertical = 12.dp)
            )
            InfoWeatherItem(
                label = "Probabilidade de chuva",
                iconRes = R.drawable.ic_cloud,
                temperature = "0%"
            )
            HorizontalDivider(
                color = Gray700,
                modifier = Modifier.padding(vertical = 12.dp)
            )
            InfoWeatherItem(
                label = "Velocidade do vento",
                iconRes = R.drawable.ic_wind,
                temperature = "8 km/h"
            )
            HorizontalDivider(
                color = Gray700,
                modifier = Modifier.padding(vertical = 12.dp)
            )
            InfoWeatherItem(
                label = "Umidade do ar",
                iconRes = R.drawable.ic_water,
                temperature = "40%"
            )
            HorizontalDivider(
                color = Gray700,
                modifier = Modifier.padding(vertical = 12.dp)
            )
            InfoWeatherItem(
                label = "Índice UV",
                iconRes = R.drawable.ic_wind,
                temperature = "5"
            )
        }
    }
}

@Preview
@Composable
private fun InfoWeatherPrev() {
    InfoWeatherCard(modifier = Modifier.fillMaxWidth())
}