package com.ambient.simpleui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.setContent
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text("Hellooo")
        }
    }

    @Composable
    fun Greeting(name: String) {
        Text (text = "Hello $name!")
    }

    @Preview
    @Composable
    fun PreviewGreeting() {
        Greeting("Android")
    }
}