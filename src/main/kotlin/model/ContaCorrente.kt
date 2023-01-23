package model

open class ContaCorrente : ContaBancaria() {

    val taxaDeOperacao : Double = 0.45 // 45 centavos

    override fun depositar(valor: Double) : Double {

        return (this.saldo + (valor - taxaDeOperacao)).also { super.saldo = it }
    }

    override fun sacar(valor: Double) : Double {
        if (this.saldo  - valor - taxaDeOperacao >= 0) {
            var novoSaldo = (this.saldo - valor - taxaDeOperacao).also { super.saldo = it }
            return novoSaldo
        }
        return this.saldo
    }


}