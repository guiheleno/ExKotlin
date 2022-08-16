fun main (){

    /*
		Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
		número é par ou ímpar, e se é positivo ou negativo.

	*/

        var numero: Int

            println("Digite um número inteiro: ")
             numero = readln().toInt()

        if (numero % 2 == 0) {
             println("Número par")
    }
        else {
            println("Número ímpar")
    }

    // Informa se o numero é positivo ou negativo

        if (numero >= 0) {
             println("Número positivo")
    }
        else {
            println("Número negativo")
        }




    }