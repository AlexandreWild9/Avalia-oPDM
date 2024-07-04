package com.example.avaliacaofinalpdm

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun BikeScreen(navController: NavController) {
    var codigo by remember { mutableStateOf("") }
    var modelo by remember { mutableStateOf("") }
    var materialChassi by remember {
        mutableStateOf("")
    }
    var aro by remember {
        mutableStateOf("")
    }
    var preco by remember {
        mutableStateOf("0.0")
    }
    var qtdMarcha by remember {
        mutableStateOf("0")
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Bikes")
        OutlinedTextField(
            value = codigo, onValueChange = { codigo = it },
            label = { Text(text = "Codigo") },
            modifier = Modifier.padding(8.dp)
        )
        OutlinedTextField(
            value = modelo, onValueChange = { modelo = it },
            label = { Text(text = "Modelo") },
            modifier = Modifier.padding(8.dp)
        )
        OutlinedTextField(
            value = materialChassi, onValueChange = { materialChassi = it },
            label = { Text(text = "Material do Chassi") },
            modifier = Modifier.padding(8.dp)
        )
        OutlinedTextField(
            value = aro, onValueChange = { aro = it },
            label = { Text(text = "Codigo") },
            modifier = Modifier.padding(8.dp)
        )
        OutlinedTextField(
            value = preco, onValueChange = { preco = it },
            label = { Text(text = "Preço") },
            modifier = Modifier.padding(8.dp)
        )
        OutlinedTextField(
            value = qtdMarcha, onValueChange = { qtdMarcha = it },
            label = { Text(text = "Quantidade de Marchas") },
            modifier = Modifier.padding(8.dp)
        )
        Button(onClick = {
            navController.navigate("ListaBikes")
        }) {
            Text(text = "Cadastrar Bicicleta")
        }
    }
}