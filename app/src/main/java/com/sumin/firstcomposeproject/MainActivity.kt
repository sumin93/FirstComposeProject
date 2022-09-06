package com.sumin.firstcomposeproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UserInfo(name = "John", age = 25)
        }
    }
}

@Preview
@Composable
fun UserInfoPreview() {
    UserInfo(name = "John", age = 25)
}

@Composable
fun UserInfo(name: String, age: Int) {
    Column {
        repeat (10) {
            Text(text = "Hello $name! You are $age years old")
        }
    }
}
