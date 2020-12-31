package com.ambient.simpleui.theme

import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.ui.graphics.Color

val LightColorPalette = lightColors(
        primary = Green300,
        primaryVariant = Green500,
        onPrimary = Color.White,
        secondary = Green300,
        surface = day,
        background = dayBG,
        onBackground = black,
        onSecondary = Color.White,
        error = Red800
)

val DarkColorPalette = darkColors(
        primary = Green300,
        primaryVariant = Green500,
        onPrimary = Color.Black,
        secondary = Green300,
        surface = night,
        background = nightBG,
        onBackground = white,
        onSecondary = Color.White,
        error = Red200
)