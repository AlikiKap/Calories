package com.example.calories


import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.toSize

@Composable
fun WeightField(weightInput:String,onValueChange:(String)->Unit){
    OutlinedTextField(weightInput = weightInput, onValueChange = onValueChange,
    label = "weight",
    singleLine = true,
    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
        modifier = Modifier.fillMaxWidth()
    )
}

fun OutlinedTextField(weightInput: String, onValueChange: (String) -> Unit, label: String, singleLine: Boolean, keyboardOptions: KeyboardOptions, modifier: Modifier) {

}
