fun main() {

    println("Informe o seu nome: ")
    var nome = readln()

    println("Informe a sua idade: ")
    var idade = readln(). toInt()

    println("Você será questionado sobre a forma que realizou a sua compra. Digite 'sim' para continuar")
    var formaCompra = readln()

    val cliente1 = Cliente (nome, idade, formaCompra )

    cliente1.forCompra()

    cliente1.cartaoLoja()
}