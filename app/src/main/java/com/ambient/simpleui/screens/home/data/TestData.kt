package com.ambient.simpleui.screens.home.data

import com.ambient.simpleui.R
import com.ambient.simpleui.screens.home.data.models.Places


val placesList: List<Places> = listOf(
        getPlace(),
        getPlace(),
        getPlace()
)

private fun getPlace(): Places =
        Places(
                "Mt Everest",
                "India",
                R.drawable.image,
                "Mount Everest is Earth's highest mountain above sea level, located in the Mahalangur Himal sub-range of the Himalayas. The China–Nepal border runs across its summit point. Its elevation of 8,848.86 m was most recently established in 2020 by the Nepali and Chinese authorities."
        )
