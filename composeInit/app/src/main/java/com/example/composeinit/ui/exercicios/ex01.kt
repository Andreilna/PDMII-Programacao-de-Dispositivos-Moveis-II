package com.example.composeinit.ui.exercicios

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun calcularIrrf() {
    val salariosBrutos = listOf(2000.0, 2500.0, 5000.0, null)

    for (salarioBruto in salariosBrutos) {
        if (salarioBruto == null) {
            printarResultadoUI(salarioBruto)
            continue
        }

        if (salarioBruto < 2259.20) {
            println("$salarioBruto  R$ 0,00")
        }

        if (salarioBruto >= 2259.21 && salarioBruto <= 2826.65) {
            val imposto = salarioBruto * (7.5 / 100)
            println("$salarioBruto R$ $imposto")
        }

        if (salarioBruto > 2826.65) {
            val imposto = salarioBruto * (15.0 / 100)
            println("$salarioBruto R$ $imposto")
        }
    }
}

fun printarResultado(salarioBruto: Double?, imposto: Double = 0.0){
    println("$salarioBruto R$ 0,00")
}

@Composable
fun printarResultadoUI(salarioBruto: Double?, imposto: Double = 0.0){
    Text("$salarioBruto R$ 0,00")
}