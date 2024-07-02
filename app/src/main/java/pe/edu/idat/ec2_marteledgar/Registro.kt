package pe.edu.idat.ec2_marteledgar

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
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

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun pantallaPrincipal(){
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
    Box (modifier = Modifier.padding(top = 100.dp)){
        Text(text = "INFORMACION", modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)
        miEspacio(espacio = 15)
        OutlinedTextField(
            value = nombre,
            onValueChange = { nombre = it },
            modifier = Modifier.fillMaxWidth(),
            label = { Text(text = "Nombre") },
            maxLines = 1,
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text))
        miEspacio(espacio = 15)
        OutlinedTextField(
            value = nombre,
            onValueChange = { nombre = it },
            modifier = Modifier.fillMaxWidth(),
            label = { Text(text = "Apellidos") },
            maxLines = 1,
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text))
        miEspacio(espacio = 15)
        TextField(
            value = nombre,
            onValueChange = { nombre = it },
            modifier = Modifier.fillMaxWidth(),
            label = { Text(text = "DNI") },
            maxLines = 1,
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text))
        miEspacio(espacio = 15)
        OutlinedTextField(
            value = nombre,
            onValueChange = { nombre = it },
            modifier = Modifier.fillMaxWidth(),
            label = { Text(text = "Celular") },
            maxLines = 1,
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text))
        miEspacio(espacio = 15)
        OutlinedTextField(
            value = nombre,
            onValueChange = { nombre = it },
            modifier = Modifier.fillMaxWidth(),
            label = { Text(text = "Email") },
            maxLines = 1,
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text))
        miEspacio(espacio = 15)
        radioButton(color) {color=it}
    }
}
