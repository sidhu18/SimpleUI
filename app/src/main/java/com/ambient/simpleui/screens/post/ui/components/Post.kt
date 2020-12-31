package com.ambient.simpleui.screens.post.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.ambient.simpleui.screens.home.data.models.Places

@Composable
fun Post(post: Places){
    Surface {
        Column {
            Text(text = post.name)
        }
    }
}