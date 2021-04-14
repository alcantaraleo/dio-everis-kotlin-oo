package main.kotlin.one.digitalinnovation.bank

class Person {
    var firstName: String
    var lastName: String
    var cpf: String
    private set


    constructor(firstName: String, lastName: String, cpf: String) {
        this.firstName = firstName
        this.lastName = lastName
        this.cpf = cpf
    }

    fun fullName() = "$firstName $lastName"
}