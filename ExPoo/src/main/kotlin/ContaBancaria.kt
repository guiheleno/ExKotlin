class ContaBancaria (
    var cliente: String,
    var agencia: String,
    val conta: String,
    var saldo: Double
) {


    var limite = false
    var saldoConta = 0.0

    constructor(
        cliente: String,
        agencia: String,
        conta: String,
        saldo: Double,
        limite: Boolean,
        saldoConta: Double

    ): this(cliente, agencia, conta, saldo){
        this.limite = limite
        this.saldoConta = saldoConta }

    fun verificarSaldo(){
        println("O saldo da conta do cliente é R$$saldo")}

    fun sacar(valor: Double){
        if(saldo > 0.0 && valor <= saldo){
            saldo -= valor
            println("Saque de R$$valor realizado com sucesso!")
        }else{
            println("Saque de R$$valor negado!")}
    }

    fun transferencia(valor: Double){
        if(valor > 0.0){
            saldo += valor
            println("Transferência realizada com sucesso!")
        }else{
            println("Transferência negada!")
        }
    }

}