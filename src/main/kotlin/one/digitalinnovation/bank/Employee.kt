package one.digitalinnovation.bank

import main.kotlin.one.digitalinnovation.bank.Person
import java.math.BigDecimal

abstract class Employee(
	firstName: String, lastName: String, cpf: String, val salary: BigDecimal
					   ) : Person(
	firstName,
	lastName,
	cpf
								 ) {

	abstract fun calculateBonus(): BigDecimal

	override fun toString(): String = """
    First Name: $firstName
    Last Name: $lastName
    Document Number: $cpf
    Salary: $salary
    Bonus: ${calculateBonus()}
""".trimIndent()
}