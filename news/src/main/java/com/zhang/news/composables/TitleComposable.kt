package com.zhang.news.composables

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview()
@Composable
fun TitleComposable(titleComposableViewModel: TitleComposableViewModel) {
    Text(
        text = titleComposableViewModel.title,
        color = Color.Black,
        fontSize = 25.sp,
        modifier = Modifier.padding(15.dp)
    )

}