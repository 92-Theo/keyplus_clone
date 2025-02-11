package com.spone.keyplusclone.ui.screen.login

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.spone.keyplusclone.R
import com.spone.keyplusclone.ui.component.Greeting
import com.spone.keyplusclone.ui.theme.KeypluscloneTheme

@Composable
fun LoginScreen(
    navigateToSplash: () -> Unit,
    setLanguage: (String) -> Unit,
) {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column {
            Greeting(
                name = "LoginScreen",
                modifier = Modifier.padding(innerPadding)
            )

            Greeting(
                name = stringResource(R.string.greeting),
                modifier = Modifier.padding(innerPadding)
            )

            Button(
                onClick = {
                    setLanguage("ko")
                }
            ){
                Text("한글")
            }

            Button(
                onClick = {
                    setLanguage("en")
                }
            ){
                Text("English")
            }

            Button(
                onClick = {
                    navigateToSplash()
                }
            ){  
                Text("splash 페이지")
            }
        }
    }
}

@Preview("LoginScreen")
@Preview("LoginScreen", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun PreviewLoginScreen() {
    KeypluscloneTheme {
        LoginScreen(
            setLanguage = { },
            navigateToSplash = { }
        )
    }
}