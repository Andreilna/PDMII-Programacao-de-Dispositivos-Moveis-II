package com.example.teste.exercicios
fun calcularIrrf() {
    val salariosBrutos = listOf<Double?>(2000.0, 2500.0, 5000.0, null)

    for (salarioBruto in salariosBrutos) {
        if (salarioBruto == null) {
            println("$salarioBruto R$ 0,00")
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