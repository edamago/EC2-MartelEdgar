package pe.edu.idat.ec2_marteledgar

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun toolBar(){
    TopAppBar(title = { Text(text = "AppIDAT") },
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
        containerColor = Color.White,
        titleContentColor = Color.Black
    ),
        navigationIcon = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Filled.ArrowBack,
                    contentDescription = "",
                    tint = Color.White
                )
            }
        })
}
@Composable
fun miEspacio(espacio: Int) {
    Spacer(modifier = Modifier.size(espacio.dp))
}
@Composable
fun radioButton(nombre: String, onItemSelected: (String) -> Unit) {
    Column(Modifier.fillMaxWidth()) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(6.dp)
        ) {

            RadioButton(selected = nombre == "Azul", onClick = { onItemSelected("Azul") })
            Text(text = "Azul",Modifier.padding(top=10.dp))
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(6.dp)
        ) {

            RadioButton(selected = nombre == "Rojo", onClick = { onItemSelected("Rojo") })
            Text(text = "Rojo",Modifier.padding(top=10.dp))
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(6.dp)
        ) {

            RadioButton(selected = nombre == "Verde", onClick = { onItemSelected("Verde") })
            Text(text = "Verde",Modifier.padding(top=10.dp))
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(6.dp)
        ) {

            RadioButton(selected = nombre == "Otro", onClick = { onItemSelected("Otro") })
            Text(text = "Otro",Modifier.padding(top=10.dp))
        }
    }
}