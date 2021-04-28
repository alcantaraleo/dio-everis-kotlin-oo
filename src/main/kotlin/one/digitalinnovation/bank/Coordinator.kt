package one.digitalinnovation.bank

import java.math.BigDecimal

class Coordinator(firstName: String, lastName: String, cpf: String, salary: BigDecimal) :
    Employee(firstName, lastName, cpf, salary) {

    override fun calculateBonus(): BigDecimal = salary.multiply(BigDecimal.valueOf(1.25))

}