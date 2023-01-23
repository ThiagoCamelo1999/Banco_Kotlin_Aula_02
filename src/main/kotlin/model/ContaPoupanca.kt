package model

open class ContaPoupanca : ContaBancaria() {

    var limite : Double = -1000.00

    override fun depositar(valor: Double) : Double {
        return (this.saldo + valor).also { super.saldo = it }
    }

    override fun sacar(valor: Double) :Double {
        if (this.saldo - valor >= limite ) {
            return (this.saldo - valor).also { super.saldo = it }
        }
        return this.saldo
    }
}