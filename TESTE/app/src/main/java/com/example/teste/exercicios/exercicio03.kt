package com.example.teste.exercicios

fun validarAcesso(token: String?): String {
    if (token == null) {
        return "Alerta: Token não informado"
    }

    if (token?.length ?: 0 > 10){
        return "Autorizado"
    }

    return "Alerta: Token muito curto"
}