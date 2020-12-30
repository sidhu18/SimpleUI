package com.ambient.simpleui.screens.home.ui.data.models

import androidx.annotation.DrawableRes

data class Places(
        val name: String,
        val country: String,
        @DrawableRes val image: Int,
        val description: String
)
