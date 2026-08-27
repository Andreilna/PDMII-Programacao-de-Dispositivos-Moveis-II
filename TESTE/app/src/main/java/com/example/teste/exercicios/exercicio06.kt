package com.example.teste.exercicios

import com.example.teste.model.Produto
import com.example.teste.util.emReais

//fun produto(nome: String, preco: Double, categoria: String){
//
//    if ( categoria == "Eletrônicos"){
//        val precoCorrigido = preco * 1.05
//        println("$nome $categoria R$$preco R$$precoCorrigido")
//    }
//
//    if ( categoria != "Eletrônicos"){
//        println("$nome $categoria R$$preco R$$preco")
//    }
//}

private const val CATEGORIA_ALVO = "Eletrônicos"
private const val FATOR_REAJUSTE = 1.05

fun reajusteParaCategoriaEletronicos(catalogo: List<Produto>): List<Produto> =
    catalogo
        .filter { produto -> produto.categoria == CATEGORIA_ALVO }
        .map { eletronico ->
            eletronico.copy(
                preco = eletronico.preco * FATOR_REAJUSTE,
            )
        }

fun reajusteParaTodos(catalogo: List<Produto>): List<Produto> =
    catalogo
        .map { todos -> todos.copy(
            nome = todos.nome + "Fatec",
            preco = todos.preco + 1000.0
        )}

fun executarEx06(){
    val catalogo = listOf(
        Produto("Notebook",3000.0, "Eletrônicos"),
        Produto("Cadeira",800.0, "Móveis"),
        Produto("Fone",200.0, "Eletrônicos")
    )
    reajusteParaCategoriaEletronicos(catalogo).forEach { produto ->
        println("${produto.nome} (${produto.categoria}): ${produto.preco.emReais()}")
    }
}