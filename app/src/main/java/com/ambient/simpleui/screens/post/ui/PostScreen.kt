package com.ambient.simpleui.screens.post.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.ambient.simpleui.R
import com.ambient.simpleui.screens.home.data.models.Places
import com.ambient.simpleui.screens.post.ui.components.Post

@Composable
fun PostScreen(navController: NavController) {
    val post = Places(
        "Mt Everest",
        "India",
        R.drawable.image,
        "Mount Everest is Earth's highest mountain above sea level, located in the Mahalangur Himal sub-range of the Himalayas. The China–Nepal border runs across its summit point. Its elevation of 8,848.86 m was most recently established in 2020 by the Nepali and Chinese authorities."
    )
    Post(post = post)
}