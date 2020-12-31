package com.ambient.simpleui.screens.home.ui.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import com.ambient.simpleui.screens.home.data.models.Places

@Composable
fun PlacesCardList(placesList: List<Places>, onItemClick: (Places) -> Unit) {
    LazyColumn {
        items(items = placesList) {
            PlacesCard(
                    places = it,
                    onClick = { onItemClick(it) }
            )
        }
    }
}