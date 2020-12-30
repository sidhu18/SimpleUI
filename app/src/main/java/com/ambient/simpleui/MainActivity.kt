package com.ambient.simpleui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.ambient.simpleui.screens.home.ui.components.PlacesCard
import com.ambient.simpleui.screens.home.ui.data.models.Places
import com.ambient.simpleui.theme.AppTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val currentTheme = isSystemInDarkTheme()
            AppTheme(darkTheme = currentTheme) {
                Surface(color = MaterialTheme.colors.background) {

                    val placesList: List<Places> = listOf(
                            getPlace(),
                            getPlace(),
                            getPlace()
                    )

                    LazyColumn {
                        items(items = placesList) {
                            PlacesCard(places = it)
                        }
                    }

                }
            }
        }
    }

    private fun getPlace(): Places =
            Places(
                    "Mt Everest",
                    "India",
                    R.drawable.image,
                    "Mount Everest is Earth's highest mountain above sea level, located in the Mahalangur Himal sub-range of the Himalayas. The China–Nepal border runs across its summit point. Its elevation of 8,848.86 m was most recently established in 2020 by the Nepali and Chinese authorities."
            )
}