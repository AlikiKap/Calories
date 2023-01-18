package com.example.calories

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun CaloriesScreen(){
    var weightInput by remember{ mutableStateOf("") }
    var weight = weightInput.toIntOrNull() ?: 0
    var male by remember{ mutableStateOf(true) }
    var intensity by remember{ mutableStateOf(1.3f) }
    var result by remember{ mutableStateOf(0) }
    Column(
        modifier = Modifier.padding(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),

    ) {
        Heading(title = stringResource(R.string.calories))
        WeightField(weightInput = weightInput, onValueChange = {weightInput = it})
        GenderChoices(male = male, setGenderMale = {male = it})
        IntensityList(onClick ={intensity = it})
        Text(text = result.toString(), color = MaterialTheme.colors.secondary, fontWeight = FontWeight.Bold)
        Calculation(male = male, weight = weight, intensity = intensity, setResult = {result = it})
    }
}