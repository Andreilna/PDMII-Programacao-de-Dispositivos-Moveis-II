package com.example.teste.model;

class AlunoNormal (
    var nome:String,
    val idade:Int
){
    fun apresentar(){
        println("Olá, meu nome é $nome e tenho $idade anos.")
    }
}
