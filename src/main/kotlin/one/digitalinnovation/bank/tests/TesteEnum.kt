package one.digitalinnovation.bank.tests

import one.digitalinnovation.bank.TipoCliente

fun main() {
    TipoCliente.values().forEach { tipoCliente -> println("${tipoCliente.name} :: ${tipoCliente.descricao}") }

    val PF = TipoCliente.PF
    val PJ = TipoCliente.PJ

    println(PF)
    println(PJ)
}
