package com.example.teste.exercicios

import com.example.teste.model.Reserva

fun executarEx08(){
    val casosDeTeste = listOf(
        Reserva(2, 3),
        Reserva(0, 3),
        Reserva(2, 0)
    )

    casosDeTeste.forEach { reserva ->
        val retorno = reserva.confirmar()
        println("Hospedes " +
                "${reserva.quantidadeDeHospedes}, dias " +
                "${reserva.diasDeEstadia}"+ " - confirmar() = " +
                "$retorno, status = ${reserva.status}")
    }
}
