package com.example.a0338livepreviewforcomposables.Composable

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Nameview ( name : String ){
    Text("Hello $name " , color = Color.Red)
}
@Preview(showSystemUi = true , name = "arabic" , locale = "ar") // ar >> arabic
@Preview(showSystemUi = false , name = "english" , locale = "en") // en >> english
@Composable
fun preview () {
    Nameview("Mohammed")
}

