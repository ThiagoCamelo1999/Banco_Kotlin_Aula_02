package model

open abstract class ContaBancaria(var saldo: Double = 0.00) {

    var numeroConta = 0


    open abstract fun sacar(valor: Double): Double
    open abstract fun depositar(valor: Double): Double
    open fun mostrarDados(): String {
        return "Numero da Conta: $numeroConta\nSaldo: $saldo\n"
    }

    open fun transferir(valor: Double, contaSaque: ContaBancaria, contaDeposito: ContaBancaria) {
        contaSaque.sacar(valor)
        contaDeposito.depositar(valor)
    }

    fun saldoInsuficiente(): String {
        return "Saldo insuficiente para operação"
    }

    override fun toString(): String {
        return  "Numero da Conta $numeroConta Saldo $saldo"

    }


}