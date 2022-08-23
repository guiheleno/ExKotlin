fun main() {

    /* 6) Crie uma classe conta bancaria e apresente os atributos e métodos
          referentes esta classe, em seguida crie um objeto conta bancaria, defina
          as instancias deste objeto e apresente as informações deste objeto no
          console.
     */

    println("Digite o nome do cliente: ")
    val cliente = readln()

    println("Digite a agencia do cliente: ")
    val agencia = readln()

    println("Digite a conta bancária do cliente: ")
    val conta = readln()

    println("Digite o saldo inicial do cliente: ")
    val saldo = readln().toDouble()

    val conta1 = ContaBancaria (cliente, agencia, conta, saldo)

    conta1.verificarSaldo()
    println()

    conta1.sacar(750.0)
    println()

    conta1.transferencia(2350.0)
    println()

    conta1.sacar(750.0)
    println()

    conta1.verificarSaldo()

}