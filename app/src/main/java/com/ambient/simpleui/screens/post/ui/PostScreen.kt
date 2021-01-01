package com.ambient.simpleui.screens.post.ui

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.ambient.simpleui.R
import com.ambient.simpleui.screens.home.data.models.Places
import com.ambient.simpleui.screens.post.ui.components.Post

const val ARG_POST_NAME = "name"
const val ARG_POST_COUNTRY = "country"
const val ARG_POST_IMAGE_RES = "image_res"
const val ARG_POST_DESCRIPTION = "description"

@Composable
fun PostScreen(
    navController: NavController,
    name: String,
    country: String,
    @DrawableRes imageRes: Int,
    description: String
) {
    val post = Places(
        name,
        country,
        imageRes,
        description
    )
    Post(post = post)
}