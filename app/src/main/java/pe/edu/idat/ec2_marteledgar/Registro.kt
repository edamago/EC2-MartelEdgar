package pe.edu.idat.ec2_marteledgar

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun pantallaPrincipal(){
    Scaffold(
        topBar = { toolBar()},
        content = { Box {
            Text(text = "INFORMACION", modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)
        }})

}
