package one.digitalinnovation.bank.tests

import one.digitalinnovation.bank.Authenticator
import one.digitalinnovation.bank.Customer
import one.digitalinnovation.bank.TipoCliente

fun main() {
	val customer = Customer("Cliente", "numero 1", "123.123.123-12", TipoCliente.PF, "123456")

	println(customer)

	Authenticator.authenticate(customer)
}