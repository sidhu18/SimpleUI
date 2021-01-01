package com.ambient.simpleui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController
import com.ambient.simpleui.screens.home.ui.HomeScreen
import com.ambient.simpleui.screens.post.ui.*

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

        composable(
            route = "${Screen.Post.route.name}/{$ARG_POST_NAME}/{$ARG_POST_COUNTRY}/{$ARG_POST_IMAGE_RES}/{$ARG_POST_DESCRIPTION}",
            arguments = listOf(
                navArgument(ARG_POST_NAME) { type = NavType.StringType },
                navArgument(ARG_POST_COUNTRY) { type = NavType.StringType },
                navArgument(ARG_POST_IMAGE_RES) { type = NavType.IntType },
                navArgument(ARG_POST_DESCRIPTION) { type = NavType.StringType },
            )
        ) {
            PostScreen(
                navController,
                it.arguments?.getString(ARG_POST_NAME)!!,
                it.arguments?.getString(ARG_POST_COUNTRY)!!,
                it.arguments?.getInt(ARG_POST_IMAGE_RES)!!,
                it.arguments?.getString(ARG_POST_DESCRIPTION)!!
            )
        }
    }
}