package com.joy.composetutorial.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.joy.composetutorial.R

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .verticalScroll(rememberScrollState())
            .padding(vertical = 16.dp)
    ) {
        SearchBar(
            keyword = "",
            startSearch = {},
            modifier = Modifier.padding(horizontal = 16.dp))
        HomeSection(
            title = R.string.align_your_body
        ) {
            CircleCardRow()
        }
        HomeSection(
            title = R.string.favorite_collections
        ) {
            SquareCardGrid()
        }
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE, heightDp = 300)
fun HomeScreenPreview() {
    HomeScreen()
}