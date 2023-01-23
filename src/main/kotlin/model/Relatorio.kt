package model

open class Relatorio {

    open fun gerarRelatorio(objeto: ContaBancaria){
        print(objeto.mostrarDados())
    }

}