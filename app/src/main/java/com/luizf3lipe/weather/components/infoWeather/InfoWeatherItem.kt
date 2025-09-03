package com.luizf3lipe.weather.components.infoWeather

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.luizf3lipe.weather.ui.theme.Gray200
import com.luizf3lipe.weather.ui.theme.Gray500
import com.luizf3lipe.weather.ui.theme.Typography
import com.luizf3lipe.weather.ui.theme.White

@Composable
fun InfoWeatherItem(
    modifier: Modifier = Modifier,
    label: String,
    temperature: String,
    @DrawableRes iconRes: Int,
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = iconRes),
                contentDescription = "wind icon",
                modifier = Modifier.size(24.dp),
                colorFilter = ColorFilter.tint(Gray500)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = label,
                style = Typography.bodyMedium,
                color = Gray200
            )
        }
        Text(
            text = temperature,
            style = Typography.bodyLarge,
            color = White
        )
    }
}