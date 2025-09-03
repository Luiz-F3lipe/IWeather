package com.luizf3lipe.weather.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.luizf3lipe.weather.R
import com.luizf3lipe.weather.ui.theme.BlueLight
import com.luizf3lipe.weather.ui.theme.Gray200
import com.luizf3lipe.weather.ui.theme.Gray400
import com.luizf3lipe.weather.ui.theme.Gray600
import com.luizf3lipe.weather.ui.theme.Typography
import com.luizf3lipe.weather.ui.theme.White

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.background),
            contentDescription = "background image",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "logo image",
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 32.dp),
            contentScale = ContentScale.FillWidth
        )

        Column(
            modifier = modifier
                .align(Alignment.Center)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row {
                Text(
                    text = "Boas Vindas ao ",
                    style = Typography.headlineSmall,
                    color = White
                )

                Text(
                    text = "IWeather",
                    style = Typography.headlineSmall,
                    color = BlueLight
                )
            }
            Text(
                text = "Escolha um local para ver a previsão do tempo",
                style = Typography.bodyMedium,
                color = Gray200
            )

            SearchInput()
        }
    }
}

@Composable
fun SearchInput() {
    var text by remember { mutableStateOf("") }
    TextField(
        value = text,
        onValueChange = { text = it },
        placeholder = {
            Text(
                text = "Buscar local",
                color = Gray400
            )
        },
        singleLine = true,
        colors = TextFieldDefaults.colors(
            focusedContainerColor = Gray600,
            focusedTextColor = Gray400,
            unfocusedTextColor = Gray400,
            unfocusedContainerColor = Gray600,
            disabledContainerColor = Gray600,
            cursorColor = BlueLight,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp, vertical = 24.dp)
            .height(56.dp)
            .clip(RoundedCornerShape(12.dp))
    )
}

@Preview
@Composable
private fun HomeScreenPrev() {
    HomeScreen(modifier = Modifier.fillMaxSize())
}