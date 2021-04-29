package one.digitalinnovation.bank.tests

import one.digitalinnovation.bank.Authenticator
import one.digitalinnovation.bank.Manager
import java.math.BigDecimal

fun main() {
	val manager = Manager(
		"Joao",
		"da Silva",
		"CPF1",
		BigDecimal.valueOf(20000),
		"pass1223"
						 )

	Authenticator.authenticate(manager)

}

