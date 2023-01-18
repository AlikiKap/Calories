package com.example.calories

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource

@Composable
fun Calculation(male:Boolean,weight:Int,intensity:Float,setResult:(Int)->Unit){
    Button(onClick = {
        if (male){
            setResult(((879+ 10.2 * weight)* intensity).toInt())
        }
        else{
            setResult(((879+ 7.18 * weight)* intensity).toInt())
        }
    },
    modifier = Modifier.fillMaxWidth()) {

             Text(text = stringResource(R.string.calculate))

    }
}