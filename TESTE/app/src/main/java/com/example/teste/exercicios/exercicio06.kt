package com.example.teste.exercicios

fun produto(nome: String, preco: Double, categoria: String){

    if ( categoria == "Eletrônicos"){
        val precoCorrigido = preco * 1.05
        println("$nome $categoria R$$preco R$$precoCorrigido")
    }

    if ( categoria != "Eletrônicos"){
        println("$nome $categoria R$$preco R$$preco")
    }
}