val estoque = mutableListOf<String>()

fun addProduto(produto: String) {

    if (produto != "") {
        estoque.add(produto)
        println("O $produto foi adicionado no estoque!")
    } else {
        println("Produto Inválido")
    }
}

fun removeProduto() {

    while (true) {
        println("Digite algum produto para ser excluído do estoque: ")
        val produto = readln()

        //contains - Vai verificar se a lista contém um determinado valor
        if (estoque.contains(produto)) {
            estoque.remove(produto)
            println("O $produto foi excluído do estoque")
            break
        } else {
            println("O $produto não existe no estoque")
        }
    }
}

fun updateProduto() {
    println("Digite um produto que deseja atualizar no estoque: ")
    val produto = readln()

    if (estoque.contains(produto)) {

        val posicao = estoque.indexOf(produto)
        println("Digite o novo nome do produto: ")
        estoque[posicao] = readln()
        println("Produto atualizado no estoque!")

    } else {

        println("O $produto não existe no estoque")
    }
}

fun getEstoque() {
    println()
    println(estoque)
}
