package com.religada.rickmortykmp.ui.core.navigation.bottomnavigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.religada.rickmortykmp.ui.core.navigation.Routes
import com.religada.rickmortykmp.ui.home.tabs.characters.CharactersScreen
import com.religada.rickmortykmp.ui.home.tabs.episodes.EpisodesScreen

@Composable
fun NavigationBottomWrapper(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Routes.Episodes.route) {
        composable(Routes.Episodes.route) {
            EpisodesScreen()
        }
        composable(Routes.Characters.route) {
            CharactersScreen()
        }
    }
}
