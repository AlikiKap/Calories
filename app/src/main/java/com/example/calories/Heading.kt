package com.example.calories

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Heading(title:String){
    Text(text = title,
    fontSize = 24.sp,
    textAlign = TextAlign.Center,
    color = MaterialTheme.colors.primary,
    modifier = Modifier.fillMaxWidth()
        .padding(top = 16.dp, bottom = 16.dp)
    )
}