package com.example.teste

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
import com.example.teste.exercicios.aplicarDisconto
import com.example.teste.exercicios.calcularFatura
import com.example.teste.exercicios.calcularIrrf
import com.example.teste.exercicios.filtroFolha
import com.example.teste.exercicios.produto
import com.example.teste.exercicios.validarAcesso
import com.example.teste.model.AlunoNormal
import com.example.teste.model.Curso
import com.example.teste.ui.theme.TesteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TesteTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    var aluno = AlunoNormal("Andrei", 20)
                    // Exemplo
                    //aluno.apresentar()

                    val cursoTeste = Curso (1,"PDMII","")

                    // Exemplo
                    //exemploLambda()

                    // Atividade 01
                    //calcularIrrf()

                    // Atividade 02
                    //calcularFatura()

                    // Atividade 03
                    //val resultado = validarAcesso(null)
                    //println(resultado)

                    // Atividade 04
                    //val valorTotal = aplicarDisconto(200.0, "PIX")
                    //println(valorTotal)

                    // Atividade 05
                    //filtroFolha()

                    // Atividade 06
                    produto("Notebook", 3000.0, "Eletrónicos")

                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello Ricardo galinha!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TesteTheme {

        Greeting("Android")
    }
}

fun exemploLambda(){
    val numeros= listOf(1,2,3,4)
    val quadrados = numeros.map{ it * it }
    println("Valor dos números quadrados: " +quadrados)

    val todosNumeros= listOf(1,2,3,4,5,6,7,8,9,10)
    val pares = todosNumeros.filter{ it % 2 == 0}
    println("Valores pares: " +pares)

    numeros
        .filter{ it > 2 }// 3,4
        .map{ it * 10 }// 30, 40
        .forEach { println("Valor: $it") }
}