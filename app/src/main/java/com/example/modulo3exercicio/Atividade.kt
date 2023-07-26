package com.example.modulo3exercicio

class Atividade {
}

fun isPair(number: Int): String{
    if(number % 2 == 0){
        return "O numero $number é par"
    }
    else{
        return "O numero $number é impar"
    }
}

fun isEven(number: Int): String{
    val checkNumber = number % 2

    when(checkNumber){
        0 -> return "O numero $number é par"
        1 -> return "O numero $number é impar"
        else -> {
            return "O numero $number não é par e nem é impar"
        }
    }
}

fun sumList(list: MutableList<Int>): Int{
    var soma: Int = 0

    for(i in list){
        soma += i
    }

    return soma
}

fun main() {

    //Atividade 1: Crie uma variavel mutavel e inicialize ela com 6 e depois mude para 5
    println("Atividade 1:")
    var var1: Int = 6

    var1 = 5

    println(var1) // 5

    //Atividade 2: Crie uma variavel imutavel e inicialize com 6 e depois mude para 7
    println("Atividade 2:")

    val var2: Int = 6

    /*var2 = 7 //error: cannot be reassigned */

    println(var2) // 6

    //Atividade 3: Crie uma condicional que testa se o numero é par ou impar e imprima o resultado
    println("Atividade 3:")

    println(isPair(5))
    println(isPair(10))
    println(isPair(123436))

    //Atividade 4: faça a mesma função mas utilizando o comando when
    println("Atividade 4:")

    println(isEven(2))
    println(isEven(1))
    println(isEven(7))
    println(isEven(2233214))
    println(isEven(0))

    //Atividade 5: Crie um array de inteiros de tamanho 40
    println("Atividade 5:")

    var array: IntArray = IntArray(40)

    for (i in 1..39){

        array[i -1] = i
    }
    println(array[38])

    //Atividade 6: Crie uma lista de inteiros e escreva os numero de 1 a 99 utilizando o comando for
    println("Atividade 6:")

    var mutableList: MutableList<Int> = mutableListOf()

    for(i in 1..99){
        mutableList.add(i)
    }
    println(mutableList)

    //Atividade 7: Utilizando a lista anterior faça uma variavel soma que some todos os valores da lista
    println("Atividade 7:")

    println(sumList(mutableList))
}