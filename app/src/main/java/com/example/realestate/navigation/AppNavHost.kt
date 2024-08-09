package com.example.realestate.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.realestate.ui.theme.screens.detail.DetailsScreen
import com.example.realestate.ui.theme.screens.home.HomeScreen
import com.example.realestate.ui.theme.screens.intent.IntentScreen
import com.example.realestate.ui.theme.screens.property.PropertyScreen
import com.example.realestate.ui.theme.screens.splash.SplashScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination:String = ROUT_SPLASH
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {

        composable(ROUT_HOME) {
            HomeScreen(navController = navController)
        }
        composable(ROUT_DETAIL) {
            DetailsScreen(navController = navController)
        }

        composable(ROUT_SPLASH) {
            SplashScreen(navController = navController)
        }
        composable(ROUT_PROPERTY) {
            PropertyScreen(navController = navController)
        }
        composable(ROUT_INTENT) {
            IntentScreen(navController = navController)
        }


    }
}