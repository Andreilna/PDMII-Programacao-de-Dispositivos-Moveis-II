package com.example.teste.exercicios

fun filtroFolha() {
    val salariosBrutos = listOf(1500.0, 2000.0, 2500.0, 3000.0, 5000.0)

    val salariosLiquidos = salariosBrutos
        .map { it * 0.89 }
        .filter { it > 2000.0 }

    println("$salariosBrutos | $salariosLiquidos")
}