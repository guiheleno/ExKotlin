fun main () {

    /*

     Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente
     no final o total do somatório, a média e o total de valores lidos. O programa deve fazer
     as leituras dos valores enquanto o usuário estiver fornecendo valores positivos. Ou seja,
     o programa deve parar quando o usuário fornecer um valor negativo.

     */


        var num: Int
        var somatorio: Int = 0
        var media: Int = 0
        var totalValores: Int = 0

        println("Digite um número positivo: ")
        num = readln().toInt()

        while (num >=0) {
                totalValores += 1
                somatorio += num
                println("Digite um número positivo: ")
                num = readln().toInt()

        }
        media = somatorio / totalValores

        println("A soma é: $somatorio")
        println("A quantidade de numeros digitados é: $totalValores")
        println("A média é: $media")


}