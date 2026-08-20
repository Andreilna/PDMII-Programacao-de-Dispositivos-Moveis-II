package com.example.teste.util

import java.util.Locale

private val LOCALE_BR = Locale("pt", "BR")

fun Double.emReais():String = String.format(LOCALE_BR, format = "R\$ %,.2f", this)