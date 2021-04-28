package main.kotlin.one.digitalinnovation.bank

abstract class Person(open val firstName: String, open val lastName: String, open val cpf: String) {

    fun fullName() = "$firstName $lastName"
}