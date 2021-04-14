    package one.digitalinnovation.bank.tests

import main.kotlin.one.digitalinnovation.bank.Bank

fun main() {
    val bank = Bank(name = "Banco Digital One", code = 123)

    println(bank.name)
    println(bank.code)

    val anotherBank = bank.copy("Banco Digital One Copy")

    println(anotherBank.name)
    println(anotherBank.code)
}