package com.example.avaliacaofinalpdm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.avaliacaofinalpdm.ui.theme.AvaliacaoFinalPDMTheme
import com.google.firebase.firestore.FirebaseFirestore

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AvaliacaoFinalPDMTheme {
                val navController = rememberNavController()
                val db = FirebaseFirestore.getInstance()


                Column {
                    NavHost(
                        navController = navController,
                        startDestination = "home"
                    ) {
                        composable(route = "home") {
                            HomeScreen(navController = navController)
                        }
                        composable(route = "Bike") {
                            BikeScreen(navController = navController)
                        }
                        composable(route = "Client") {
                            ClientScreen(navController = navController)
                        }
                        composable(route = "ListaCliente") {
                            ClientListScreen(navController = navController)
                        }
                        composable(route = "ListaBikes"){
                            BikeListScreen(navController = navController)
                        }
                    }
                }

            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AvaliacaoFinalPDMTheme {
        Greeting("Android")
    }
}