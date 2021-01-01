package com.ambient.simpleui.screens.post.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import com.ambient.simpleui.screens.home.data.models.Places

@Composable
fun Post(post: Places) {
    Surface(
        modifier = Modifier.fillMaxHeight()
    ) {
        Column {
            val imageAsset = imageResource(id = post.image)
            Image(
                bitmap = imageAsset,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxWidth().height(300.dp)
            )
            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    text = post.name,
                    style = MaterialTheme.typography.h5,
                    modifier = Modifier.padding(bottom = 8.dp)
                )
                Text(
                    text = post.description,
                    style = MaterialTheme.typography.body2
                )
            }
        }
    }
}