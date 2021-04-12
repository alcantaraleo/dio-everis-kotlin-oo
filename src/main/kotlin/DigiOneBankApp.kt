package main.kotlin

class Pessoa {

    var nome: String = "leonardo"
    var cpf: String = "123.123.123.12"
        private set

    constructor()

    fun info(): String {
        return "Nome $nome e cpf $cpf"
    }
}


fun main() {
    val pessoa = Pessoa()

    println(pessoa.info())
    println(pessoa.nome)
    println(pessoa.cpf)

}