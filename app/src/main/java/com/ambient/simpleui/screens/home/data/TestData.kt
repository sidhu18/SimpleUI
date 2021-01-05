package com.ambient.simpleui.screens.home.data

import com.ambient.simpleui.R
import com.ambient.simpleui.screens.home.data.models.Places


val placesList: List<Places> = listOf(
        Places(
                "Mt Everest",
                "India",
                R.drawable.image,
                "Mount Everest is Earth's highest mountain above sea level, located in the Mahalangur Himal sub-range of the Himalayas. The China–Nepal border runs across its summit point. Its elevation of 8,848.86 m was most recently established in 2020 by the Nepali and Chinese authorities."
        ),
        Places(
                "Neuschwanstein Castle",
                "Germany",
                R.drawable.image_fort,
                "Built in 1886, Neuschwanstein is one of the most popular castles in all of Europe—and not just because it served as inspiration for Sleeping Beauty Castle at Disneyland. The majestic structure has a clifftop location and ornate rooms that attract 1.4 million visitors every year."
        ),
        Places(
                "Rügen Island, Baltic Sea",
                "Germany",
                R.drawable.image_island,
                "Germany’s largest island, Rügen has Baltic beaches, chalk-white cliffs, and a number of luxurious seaside resorts."
        )
)

private fun getPlace(): Places =
        Places(
                "Mt Everest",
                "India",
                R.drawable.image,
                "Mount Everest is Earth's highest mountain above sea level, located in the Mahalangur Himal sub-range of the Himalayas. The China–Nepal border runs across its summit point. Its elevation of 8,848.86 m was most recently established in 2020 by the Nepali and Chinese authorities."
        )
