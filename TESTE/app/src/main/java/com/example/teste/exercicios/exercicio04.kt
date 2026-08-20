package com.example.teste.exercicios

fun aplicarDisconto(valor: Double, formaPagamento: String){
    var valorFinal: Double

    if (formaPagamento == "PIX"){
       valorFinal = valor * (1 - 0.05)
        println("$formaPagamento $valorFinal")
    }

    if (formaPagamento == "Cupom"){
        valorFinal = valor * (1 - 0.10)
        println("$formaPagamento $valorFinal")
    }

    if (formaPagamento == ""){
        valorFinal = valor * (1 - 0.00)
        println("$formaPagamento $valorFinal")
    }
}