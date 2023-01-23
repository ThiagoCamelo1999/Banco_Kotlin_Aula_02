package model

open class Banco {

    val lista = arrayListOf<ContaBancaria>()

    //criando uma cópia imutável da lista para somente leitura
    val listaConsulta: List<ContaBancaria> = lista

    open fun inserirConta(objeto: ContaBancaria) {
        lista.add(objeto)

    }

    open fun removerConta(objeto: ContaBancaria) {
        lista.remove(objeto)

    }


    open fun procurarConta(numeroConta: Int) {
        listaConsulta.forEach { i ->
            if (i.numeroConta == numeroConta) {
                i.toString()
                println("Conta econtrada: $i")
            }
        }
    }

    open fun iterarLista() {
        for (i in listaConsulta) {
            println(i)
        }
    }

    open fun iterarListaDois() {
        listaConsulta.forEach() { it -> println(it) }
    }


}