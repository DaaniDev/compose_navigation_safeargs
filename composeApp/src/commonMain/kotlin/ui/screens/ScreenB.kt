package ui.screens

import ScreenBRoute
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text

@Composable
fun ScreenB(screenB: ScreenBRoute, onNavigate: () -> Unit) {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text(text = "First Name is ${screenB.firstName}, last Name is ${screenB.lastName}, Gender is ${screenB.gender}")

        Button(onClick = onNavigate) {
            Text(text = "Go Back")
        }
    }
}