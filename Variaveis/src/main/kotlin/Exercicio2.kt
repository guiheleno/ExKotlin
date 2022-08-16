fun main () {

    /*

    2 - Faça um programa em que o usuário digite o diâmetro de um círculo
        e calcule a área e o perímetro dele.

     */

    val pi = 3.14

    print("Digite o diâmetro d circulo: ")
    val diametro = readln().toDouble()

    var raio = diametro / 2
    var area = pi * (raio * raio)

    println("A área do circulo é: $area")

    var perim = 2 * pi * raio

    println("O perimetro do circulo é: $perim")


}