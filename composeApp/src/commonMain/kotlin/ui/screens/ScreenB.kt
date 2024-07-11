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

@Composable
fun ScreenB(screenBRoute: ScreenBRoute, onNavigate: () -> Unit) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = "FirstName is ${screenBRoute.firstName}, LastName is ${screenBRoute.lastName}, Gender is ${screenBRoute.gender}")

        Button(onClick = { onNavigate.invoke() }) {
            Text(text = "Go back")
        }
    }
}