import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import kotlinx.serialization.Serializable
import org.jetbrains.compose.ui.tooling.preview.Preview
import ui.screens.ScreenA
import ui.screens.ScreenB

@Composable
@Preview
fun App() {
    MaterialTheme {
        val navController = rememberNavController()
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

            NavHost(navController = navController, startDestination = ScreenARoute){

                composable<ScreenARoute>{
                    ScreenA(modifier = Modifier.fillMaxSize().padding(innerPadding)){
                        navController.navigate(ScreenBRoute("John", "Doe", "Male"))
                    }
                }

                composable<ScreenBRoute>{
                    ScreenB(screenB = it.toRoute()){
                        navController.popBackStack()
                    }
                }
            }

        }
    }
}

@Serializable
object ScreenARoute

@Serializable
data class ScreenBRoute(val firstName: String, val lastName: String, val gender: String?)

