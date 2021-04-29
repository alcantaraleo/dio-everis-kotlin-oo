package one.digitalinnovation.bank

import main.kotlin.one.digitalinnovation.bank.Person

class Customer(firstName: String, lastName: String, cpf: String, val tipoCliente: TipoCliente, val password: String) :
	Person(
		firstName,
		lastName,
		cpf
		  ), Authentication {

	override fun login(): Boolean {
		
		return "123456" == this.password
	}

	override fun toString(): String {
		return """
			First Name: $firstName
			Last Name: ${lastName.substring(0, 4)}
			CPF: ${cpf.substring(0, 3)}
			
		""".trimIndent()

	}
}