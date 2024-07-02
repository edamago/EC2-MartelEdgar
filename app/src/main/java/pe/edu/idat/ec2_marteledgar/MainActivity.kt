package pe.edu.idat.ec2_marteledgar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import pe.edu.idat.ec2_marteledgar.ui.theme.EC2MartelEdgarTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EC2MartelEdgarTheme {
                val navController= rememberNavController()
                NavHost(navController = navController, startDestination = "pantallaA",
                    builder = {
                        composable("pantallaPrincipal"){
                            pantallaPrincipal(navController)
                        }
                        composable("pantallaAcceder"){
                            pantallaAcceder(navController)
                        }
                    })
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    EC2MartelEdgarTheme {

    }
}