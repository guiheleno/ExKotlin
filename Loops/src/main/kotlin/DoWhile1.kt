fun main (){

    //5- Crie um programa que leia um número do teclado até que encontre um número igual a zero.
   // No final, mostre a soma dos números digitados.

    var soma = 0
    var cont = 0


    do{ println("Digite um numero inteiro: ")
        var num = readln().toInt()
        if(num!=0){
            cont++
            soma += num
        }

    }while(num > 0)

    println("A soma dos numeros inteiros é: $soma")



}