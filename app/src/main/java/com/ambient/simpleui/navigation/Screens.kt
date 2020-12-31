package com.ambient.simpleui.navigation

enum class ScreenName{
    HOME,
    POST,
    PROFILE
}

sealed class Screen(val route: ScreenName){
    object Home: Screen(ScreenName.HOME)
    object Post: Screen(ScreenName.POST)
    object Profile: Screen(ScreenName.PROFILE)
}