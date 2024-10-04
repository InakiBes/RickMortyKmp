package com.religada.rickmortykmp.ui.core.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.religada.rickmortykmp.ui.home.HomeScreen

@Composable
fun NavigationWrapper() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.Home.route) {
        composable(Routes.Home.route) {
            HomeScreen()
        }
    }
}
