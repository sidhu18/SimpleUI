package com.ambient.simpleui.screens.home.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.ambient.simpleui.R
import com.ambient.simpleui.screens.home.data.models.Places

@Composable
fun PlacesCard(places: Places, onClick: () -> Unit) {
    Surface(
            shape = RoundedCornerShape(5.dp),
            elevation = 8.dp,
            modifier = Modifier
                    .padding(8.dp)
                    .clickable(onClick = onClick)
    ) {
        val imageRes = imageResource(id = places.image)
        Column(modifier = Modifier.fillMaxWidth()) {
            Image(
                    bitmap = imageRes,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                            .fillMaxWidth()
                            .height(144.dp)
            )
            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                        text = places.name,
                        style = MaterialTheme.typography.h5
                )
                Text(
                        text = places.description,
                        style = MaterialTheme.typography.body2
                )
            }

        }
    }

}

@Composable
@Preview
fun DefaultPlacesCard() {
    val defaultPlaces = Places(
            "Mt Everest",
            "India",
            R.drawable.image,
            "Mountain"
    )
    PlacesCard(defaultPlaces){

    }
}