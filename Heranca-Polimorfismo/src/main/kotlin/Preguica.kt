class Preguica (
    nome: String,
    idade: Int
        ) : Animal (nome, idade){


    override fun emitirSom() {
        println("Zzzzzz")
    }

    override fun escalarArvore(println: Unit) {
        super.escalarArvore(
            println("Preguiça escalando a árvore."))
    }


}