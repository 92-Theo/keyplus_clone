package com.spone.keyplusclone.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.spone.keyplusclone.service.language.LanguageService
import com.spone.keyplusclone.ui.component.Greeting
import com.spone.keyplusclone.ui.theme.KeypluscloneTheme


@Composable
fun KeyplusApp() {
    KeypluscloneTheme {
        val navController = rememberNavController()
        val languageService = LanguageService()
        val navActions = KeyplusNavigationActions(navController)


        KeyplusNavGraph(
            languageService = languageService,
            navActions = navActions,
            navController = navController,
            startDestination = KeyplusDestinations.SPLASH_ROUTE,
        )

//        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//            Greeting(
//                name = "Android",
//                modifier = Modifier.padding(innerPadding)
//            )
//        }
    }
}