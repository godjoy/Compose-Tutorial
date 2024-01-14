package com.joy.composetutorial.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyApp() {
    Scaffold(
        bottomBar = { MyBottomNavigation() }
    ) { padding ->
        HomeScreen(Modifier.padding(padding))
    }
}

@Composable
@Preview
fun MyAppPreview() {
    MyApp()
}