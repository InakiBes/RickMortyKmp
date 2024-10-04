package com.religada.rickmortykmp.ui.home

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.religada.rickmortykmp.ui.core.navigation.bottomnavigation.BottomBarItem
import com.religada.rickmortykmp.ui.core.navigation.bottomnavigation.NavigationBottomWrapper

@Composable
fun HomeScreen() {
    val items = listOf(
        BottomBarItem.Episodes(),
        BottomBarItem.Characters()
    )
    val navController = rememberNavController()

    Scaffold(bottomBar = { BottomNavigation(items, navController) }) {
        Box {
            NavigationBottomWrapper(navController)
        }
    }
}

@Composable
fun BottomNavigation(items: List<BottomBarItem>, navController: NavHostController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    NavigationBar {
        items.forEach { item ->
            NavigationBarItem(
                icon = item.icon,
                label = { Text(item.title) },
                onClick = {
                    navController.navigate(item.route) {
                        // Clean the back stack when navigating to a new route
                        navController.graph.startDestinationRoute?.let { route ->
                            popUpTo(route) {
                                saveState = true
                            }
                        }
                        launchSingleTop = true // avoid multiple copies of the same destination
                        restoreState = true // restore the state when navigating back
                    }
                },
                selected = currentDestination?.hierarchy?.any { it.route == item.route } == true,
            )
        }
    }
}
