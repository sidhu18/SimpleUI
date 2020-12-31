package com.ambient.simpleui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.ambient.simpleui.navigation.MainNav
import com.ambient.simpleui.theme.AppTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val currentTheme = isSystemInDarkTheme()
            AppTheme(darkTheme = currentTheme) {
                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = {
                                Text(
                                    text = "SimpleUI",
                                    textAlign = TextAlign.Center,
                                    modifier = Modifier.fillMaxWidth()
                                )
                            },
                            elevation = 0.dp
                        )
                    },
                    bodyContent = {
                        MainNav()
                    }
                )
            }
        }
    }
}