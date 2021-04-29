package one.digitalinnovation.bank

import java.math.BigDecimal

class Manager(firstName: String, lastName: String, cpf: String, salary: BigDecimal, val password: String) :
	Employee(
		firstName,
		lastName,
		cpf,
		salary
			), Authentication {

	override fun calculateBonus(): BigDecimal = salary.multiply(BigDecimal.valueOf(1.5))

	override fun login(): Boolean {
		return this.password == "pass123"
	}
}