package one.digitalinnovation.bank.tests

import one.digitalinnovation.bank.Coordinator
import one.digitalinnovation.bank.Employee
import one.digitalinnovation.bank.FinancialAnalyst
import one.digitalinnovation.bank.Manager
import java.math.BigDecimal

fun main() {
	val manager = Manager(
		"Joao",
		"da Silva",
		"CPF1",
		BigDecimal.valueOf(20000)
						 )
	val coordinator = Coordinator(
		"Jose",
		"Salgado",
		"CPF2",
		BigDecimal.valueOf(12000)
								 )

	val financialAnalyst = FinancialAnalyst(
		"Maria",
		"Socorro",
		"CPF3",
		BigDecimal.valueOf(9000)
										   )

	generateSalaryReport(
		listOf(
			manager,
			coordinator,
			financialAnalyst
			  )
						)

}

fun generateSalaryReport(employees: List<Employee>) {

	for (employee in employees) {
		println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=")
		println(employee)
	}

}