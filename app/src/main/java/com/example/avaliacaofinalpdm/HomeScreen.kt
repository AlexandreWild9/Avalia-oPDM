package com.example.avaliacaofinalpdm

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "Home")
        Spacer(modifier = Modifier.padding(16.dp))
        Button(
            onClick = {
                navController.navigate("Bike")
            }
        ) {
            Text(text = "Bicicletas")
        }
        Spacer(modifier = Modifier.padding(16.dp))
        Button(
            onClick = {
                navController.navigate("Client")
            }
        ) {
            Text(text = "Clientes")
        }
    }


}