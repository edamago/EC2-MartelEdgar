package pe.edu.idat.ec2_marteledgar

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun pantallaPrincipal(navController: NavController){
    var color by rememberSaveable {
        mutableStateOf("")
    }

    var nombre by rememberSaveable {
        mutableStateOf("")
    }
    Scaffold(
        topBar = { toolBar()},
        content = { Box {
            Text(text = "INFORMACION", modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)
            miEspacio(espacio = 10)
            OutlinedTextField(value = nombre,
                onValueChange = { nombre = it },
                modifier = Modifier.fillMaxWidth(),
                label = { Text(text = "Nombre") },
                maxLines = 1,
                singleLine = true,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
            )
        }})
    Column (modifier = Modifier.padding(top = 100.dp)){
        Text(text = "INFORMACION", modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)
        miEspacio(espacio = 5)
        OutlinedTextField(
            value = nombre,
            onValueChange = { nombre = it },
            modifier = Modifier.fillMaxWidth(),
            label = { Text(text = "Nombre") },
            maxLines = 1,
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text))
        miEspacio(espacio = 5)
        OutlinedTextField(
            value = nombre,
            onValueChange = { nombre = it },
            modifier = Modifier.fillMaxWidth(),
            label = { Text(text = "Apellidos") },
            maxLines = 1,
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text))
        miEspacio(espacio = 5)
        TextField(
            value = nombre,
            onValueChange = { nombre = it },
            modifier = Modifier.fillMaxWidth(),
            label = { Text(text = "DNI") },
            maxLines = 1,
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text))
        miEspacio(espacio = 5)
        OutlinedTextField(
            value = nombre,
            onValueChange = { nombre = it },
            modifier = Modifier.fillMaxWidth(),
            label = { Text(text = "Celular") },
            maxLines = 1,
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text))
        miEspacio(espacio = 5)
        OutlinedTextField(
            value = nombre,
            onValueChange = { nombre = it },
            modifier = Modifier.fillMaxWidth(),
            label = { Text(text = "Email") },
            maxLines = 1,
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text))
        miEspacio(espacio = 5)
        radioButton(color) {color=it}
        Button(onClick = {navController.navigate("Acceder")}, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Acceder")
        }
    }

}
