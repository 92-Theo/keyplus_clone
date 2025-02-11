package com.spone.keyplusclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.spone.keyplusclone.ui.KeyplusApp
import com.spone.keyplusclone.ui.component.Greeting
import com.spone.keyplusclone.ui.theme.KeypluscloneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KeyplusApp()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KeypluscloneTheme {
        Greeting("Android")
    }
}