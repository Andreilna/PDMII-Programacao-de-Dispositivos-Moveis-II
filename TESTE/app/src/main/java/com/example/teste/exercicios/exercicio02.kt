package com.example.teste.exercicios

fun calcularFatura() {
    val faturas = listOf(100.0, 150.0, 200.0)

    for (fatura in faturas){
        if (fatura > 150.0) {
            val valorFinal = (fatura*0.85)* 1.10
            println("$fatura %.2f".format(valorFinal))
        }

        if (fatura <= 150.0) {
            val valorFinal = (fatura*0.85)
            println("$fatura %.2f".format(valorFinal))
        }
    }
}
