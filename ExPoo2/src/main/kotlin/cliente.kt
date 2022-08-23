class Cliente (
    var nome: String,
    var idade: Int,
    var formaCompra: String
) {
    var clienteFiel = false

    constructor(
        nome: String,
        idade: Int,
        modalidadeCompra: String,
        clienteFiel: Boolean
    ): this(nome, idade, modalidadeCompra){
        this.clienteFiel = clienteFiel
    }

    fun forCompra(){
        println("A sua compra foi virtualmente ou presencialmente?")
        var resp = readln().toString()
        if(resp == "virtualmente" || resp == "Virtual"){
            println("Sua resposta foi $resp. Verifique as opções do site.")
        } else {
            resp != "Virtualmente" || resp != "Virtual"
            println("Sua resposta foi $resp. verifique as opções diretamente com a loja física.")
        }
    }

    fun cartaoLoja(){
        println("Possui o cartão da loja?")
        var cartao = readln().toString()
        if(cartao == "s" || cartao == "sim"){
                println("Parabéns! Você possui frete grátis, resgate seu benefício.")
        } else {
            cartao != "Sim" || cartao != "S"
                print("Faça o cartão da loja para obter os benefícios!")
        }
    }
}