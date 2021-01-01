package com.ambient.simpleui.screens.home.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import com.ambient.simpleui.navigation.Screen
import com.ambient.simpleui.screens.home.data.placesList
import com.ambient.simpleui.screens.home.ui.components.PlacesCardList

@Composable
fun HomeScreen(navController: NavController) {
    PlacesCardList(
        placesList = placesList,
        onItemClick = {
            navController.navigate(
                "${Screen.Post.route.name}/${it.name}/${it.country}/${it.image}/${it.description}"
            )
        }
    )
}