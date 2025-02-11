package com.spone.keyplusclone.ui.screen.splash

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import com.spone.keyplusclone.ui.component.Greeting
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    navigateToNext: () -> Unit,
) {
    LaunchedEffect(true)
    {
        delay(3000)
        navigateToNext()
    }

    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column {
            Greeting(
                name = "SplashScreen",
                modifier = Modifier.padding(innerPadding)
            )

            Button(
                onClick = {
                    navigateToNext()
                }
            ){
                Text("다음 페이지")
            }
        }
    }
}