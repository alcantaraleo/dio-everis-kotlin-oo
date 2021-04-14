package main.kotlin.one.digitalinnovation.bank

import java.math.BigDecimal

class Conta {

    val agencia: String
    val numero: String
    var saldo: BigDecimal

    constructor(agencia: String, numero: String, saldo: BigDecimal) {
        this.agencia = agencia
        this.numero = numero
        this.saldo = saldo
    }

    fun deposito(valor: BigDecimal) {}

    fun saque(valor: BigDecimal) {}

    fun extrato() {
        println("Saldo da conta $numero - Agência $agencia é :: $saldo")
    }

}