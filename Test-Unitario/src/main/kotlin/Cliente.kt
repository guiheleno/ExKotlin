class Cliente (var nome: String,
                   var cpf: String,
                   var cel: String) {

    val ListaCompras = mutableListOf<String>()

    init {
        verificarDados()
    }

    fun addCompra(compra: String) {
        if (compra.isNotBlank()) {
            ListaCompras.add(compra)
            println("Produto adicionado na lista de compras.")
        } else {
            println("Produto Inexistente.")
        }
    }

    fun removeCompra(compra: String) {
        if (ListaCompras.contains(compra)) {
            ListaCompras.remove(compra)
            println("Produto removido da lista de compras.")
        } else {
            println("Erro. O produto '$compra' não existe na lista!")
        }
    }

    fun exibirCompras() {
        println("LISTA DE COMPRAS\n")
        ListaCompras.forEach {
            println(it)
        }
    }

    private fun verificarDados() {
        if (nome.isBlank()) {
            throw Exception("Erro. O cadastro foi feito de maneira incorreta!")
        }

    }
}