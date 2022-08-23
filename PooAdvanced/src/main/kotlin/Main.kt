fun main () {

    try {
        print("CADASTRO DO CLIENTE\n")
        println()
        print("Digite o seu nome: ")
        val nome = readln()

        print("Digite o seu CPF: ")
        val cpf = readln()

        print("Digite o número do seu celular: ")
        val cel = readln()

        val cliente = Cliente(nome, cpf, cel)

        while (true){

            println()
            println("MENU DO CLIENTE")
            println("1 - Adicionar compra")
            println("2 - Remover compra")
            println("3 - Listar compras")
            println("4 - Encerrar")

            println()
            print("Escolha uma opção para iniciar suas compras: ")
            val opc = readln().toInt()
            println()

            when(opc){

                1 -> {
                    print("Digite o produto que deseja colocar na lista de compras: ")
                    val produto = readln()
                    cliente.addCompra(produto)
                }
                2 -> {
                    print("Digite o produto que deseja excluir da lista de compras: ")
                    val produto = readln()
                    cliente.removeCompra(produto)
                }
                3 -> {
                    cliente.exibirCompras()
                }
                4 -> break
                else -> println("Opção Inválida! Digite uma das opções que aparecem em seu menu.")

            }

        }

    }catch (e: Exception){
        println(e.message)
    }
}
