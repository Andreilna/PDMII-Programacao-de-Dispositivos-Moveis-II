package com.example.teste.exercicios

import com.example.teste.util.emReais

//fun filtroFolha() {
//    val salariosBrutos = listOf(1500.0, 2000.0, 2500.0, 3000.0, 5000.0)
//
//    val salariosLiquidos = salariosBrutos
//        .map { it * 0.89 }
//        .filter { it > 2000.0 }
//
//    println("$salariosBrutos | $salariosLiquidos")
//}

private const val FATOR_LIQUIDO = 0.89 //100% - 11% = 89%
private const val PATAMAR_MINIMO = 2000.0

fun filtrarSalarios(salariosBrutos:List<Double>):List<Double> {
    return salariosBrutos
        .map { bruto -> bruto * FATOR_LIQUIDO }
        .filter { liquido -> liquido > PATAMAR_MINIMO }
}
fun executarEx05(){
    val salariosBrutos = listOf(1500.0,2000.0,2500.0,3000.0,5000.0)
    val liquidosAprovados = filtrarSalarios(salariosBrutos)

    println("Salarios Liquidos Aprovados acima de ${PATAMAR_MINIMO.emReais()}")
    liquidosAprovados.forEach { liquido ->
        println("Salario liquido ${liquido.emReais()}")
    }
    println("Lista Original: $salariosBrutos")
}