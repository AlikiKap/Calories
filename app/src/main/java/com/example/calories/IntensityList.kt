package com.example.calories

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.toSize



@Composable
fun IntensityList(onClick:(Float)->Unit){
var expanded by remember { mutableStateOf(false) }
    var selectedText by remember{ mutableStateOf("Light") }
    var textFieldSize by remember{ mutableStateOf(Size.Zero) }
    val items = listOf("Light", "Usual","Moderate","Hard","Very hard")
    val icon = if (expanded)
        Icons.Filled.KeyboardArrowUp
    else
        Icons.Filled.KeyboardArrowDown
    Column {
        DropdownMenu(expanded = expanded, onDismissRequest = { expanded=false },
        modifier = Modifier.width(with(LocalDensity.current){textFieldSize.width.toDp()})) {
            items.forEach{ label ->
                DropdownMenuItem(onClick = {
                        selectedText = label
                        var intensity: Float = when (label){
                        "Light"-> 1.3f
                        "Usual"->1.5f
                        "Moderate"->1.7f
                        "Hard"->2f
                        "Very hard"->2.2f
                        else -> 0.0f
                }
                onClick(intensity)
                expanded = false
                }) {
                Text(text = label)
                }
            }
        }
        OutlinedTextField(readOnly = true,
            value = selectedText,
            onValueChange = {selectedText = it},
            modifier = Modifier
                .fillMaxWidth()
                .onGloballyPositioned { coordinates ->
                    textFieldSize = coordinates.size.toSize()
                },
            label = "weight",
            trailingIcon = Icon(icon,"contentDescription",
            Modifier.clickable { expanded = !expanded })
        )
    }
}

fun OutlinedTextField(readOnly: Boolean, value: String, onValueChange: () -> Unit, modifier: Modifier, label: String, trailingIcon: Unit) {

}
