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
fun ClientScreen(navController: NavController) {
    var cpf by remember {
        mutableStateOf("")
    }
    var nome by remember {
        mutableStateOf("")
    }
    var email by remember {
        mutableStateOf("")
    }
    var instagram by remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Cadastrar Clientes")
        OutlinedTextField(
            value = cpf, onValueChange = { cpf = it },
            label = { Text(text = "Cpf") },
            modifier = Modifier.padding(top = 8.dp)
        )
        OutlinedTextField(value = nome, onValueChange = { nome = it },
            label = { Text(text = "Nome") },
            modifier = Modifier.padding(top = 8.dp)
        )
        OutlinedTextField(value = email, onValueChange = { email = it },
            label = { Text(text = "Email") },
            modifier = Modifier.padding(top = 8.dp)
        )
        OutlinedTextField(value = instagram, onValueChange = { instagram = it },
            label = { Text(text = "Instagram") },
            modifier = Modifier.padding(top = 8.dp)
        )
        Button(
            onClick = {
                navController.navigate("ListaCliente")

            }) {
            Text(text = "Salvar Cliente")

        }
    }
}