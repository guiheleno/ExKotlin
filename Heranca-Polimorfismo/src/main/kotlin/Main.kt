import Cachorro as Cachorro1

fun main () {

    /*  Crie uma hierarquia de classes conforme abaixo com os seguintes atributos
        e comportamentos (observe a tabela), utilize os seus conhecimentos e distribua
        as características de forma que tudo o que for comum a todos os animais fique na classe Animal.
     */

    val cachorro = Cachorro1 (
        "Max",
        2
            )

    val cavalo = Cavalo (
        "Pé de Pano",
        5
    )

    val preguica = Preguica (
        "Sid",
        8
    )

    cachorro.emitirSom()
    println()

    cavalo.emitirSom()
    println()

    preguica.emitirSom()


}



