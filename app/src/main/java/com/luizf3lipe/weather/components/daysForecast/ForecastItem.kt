package com.luizf3lipe.weather.components.daysForecast

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.luizf3lipe.weather.R
import com.luizf3lipe.weather.ui.theme.Gray200
import com.luizf3lipe.weather.ui.theme.Gray400
import com.luizf3lipe.weather.ui.theme.Typography
import com.luizf3lipe.weather.ui.theme.White

@Composable
fun ForecastItem(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "Ter",
            style = Typography.bodyLarge,
            color = Gray200
        )
        Image(
            painter = painterResource(id = R.drawable.sun),
            contentDescription = "sun icon",
            modifier = Modifier.size(32.dp)
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(2.dp)
        ) {
            Text(
                text = "30ºC",
                style = Typography.bodyLarge,
                color = White
            )
            Text(
                text = "30ºC",
                style = Typography.bodyMedium,
                color = Gray400
            )
        }
    }
}