package com.ambient.simpleui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ambient.simpleui.screens.home.ui.HomeScreen
import com.ambient.simpleui.screens.post.ui.PostScreen
import com.ambient.simpleui.screens.post.ui.components.Post

@Composable
fun MainNav() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.Home.route.name,
    ) {
        composable(Screen.Home.route.name) {
            HomeScreen(navController)
        }

        composable(Screen.Post.route.name) {
            PostScreen(navController)
        }
    }
}