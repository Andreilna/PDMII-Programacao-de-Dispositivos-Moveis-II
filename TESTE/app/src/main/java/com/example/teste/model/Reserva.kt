package com.example.teste.model

class Reserva (
    val quantidadeDeHospedes:Int,
    val diasDeEstadia:Int,
){
    var status:String ="PENDENTE"
        private set

    fun confirmar(): Boolean{
        val dadosValidados = quantidadeDeHospedes > 0 && diasDeEstadia > 0
        if (!dadosValidados){
            return false
        }

        status = "CONFIRMADA"
        return true
    }
}