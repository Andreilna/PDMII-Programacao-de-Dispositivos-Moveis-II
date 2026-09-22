package com.example.composeinit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeinit.ui.exercicios.calcularIrrf
import com.example.composeinit.ui.lessons.L02FirstComposable
import com.example.composeinit.ui.lessons.L03Parameters
import com.example.composeinit.ui.theme.ComposeInitTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeInitTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    BoasVindas(
//                        name = "Andrei",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                }
//                L01FirstComposable()
//                L02FirstComposable()
                L03Parameters()



//                calcularIrrf()
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
    ComposeInitTheme {
        Greeting("Android")
    }
}
