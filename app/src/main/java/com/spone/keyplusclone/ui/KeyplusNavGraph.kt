package com.spone.keyplusclone.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.spone.keyplusclone.service.language.LanguageService
import com.spone.keyplusclone.ui.screen.login.LoginScreen
import com.spone.keyplusclone.ui.screen.splash.SplashScreen

@Composable
fun KeyplusNavGraph(
//    appContainer: AppContainer,
//    isExpandedScreen: Boolean,
//    modifier: Modifier = Modifier,
    languageService: LanguageService,
    navActions: KeyplusNavigationActions,
    navController: NavHostController = rememberNavController(),
//    openDrawer: () -> Unit = {},
    startDestination: String = KeyplusDestinations.SPLASH_ROUTE,
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
//        modifier = modifier
    ) {
        composable(
            route = KeyplusDestinations.SPLASH_ROUTE,
//            deepLinks = listOf(
//                navDeepLink {
//                    uriPattern =
//                        "$JETNEWS_APP_URI/${JetnewsDestinations.HOME_ROUTE}?$POST_ID={$POST_ID}"
//                }
//            )
        ) { navBackStackEntry ->
            SplashScreen(
                navigateToNext = { navActions.navigateToLogin() }
            )
//            val homeViewModel: HomeViewModel = viewModel(
//                factory = HomeViewModel.provideFactory(
//                    postsRepository = appContainer.postsRepository,
//                    preSelectedPostId = navBackStackEntry.arguments?.getString(POST_ID)
//                )
//            )
//            HomeRoute(
//                homeViewModel = homeViewModel,
//                isExpandedScreen = isExpandedScreen,
//                openDrawer = openDrawer,
//            )
        }
        composable(KeyplusDestinations.LOGIN_ROUTE) {
            LoginScreen(
                setLanguage = { code ->
                    // languageService.setLanguage(code)
                    languageService.test()
                },
                navigateToSplash = { navActions.navigateToSplash() }
            )
//            val interestsViewModel: InterestsViewModel = viewModel(
//                factory = InterestsViewModel.provideFactory(appContainer.interestsRepository)
//            )
//            InterestsRoute(
//                interestsViewModel = interestsViewModel,
//                isExpandedScreen = isExpandedScreen,
//                openDrawer = openDrawer
//            )
        }
    }
}