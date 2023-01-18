package com.example.calories

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material.RadioButton
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource

@Composable
fun GenderChoices(male:Boolean,setGenderMale:(Boolean)->Unit){
Column(modifier = Modifier.selectableGroup()) {
Row(verticalAlignment = Alignment.CenterVertically) {
    RadioButton(selected = male, onClick = { setGenderMale(true) })
    Text(text = stringResource(R.string.male))
    RadioButton(selected = !male, onClick = { setGenderMale(false) })
    Text(text = stringResource(R.string.female))
}
}
}