import model.ContaBancaria
import model.ContaCorrente
import model.ContaPoupanca
import model.Relatorio
import model.Banco

fun main() {

    val relatorio = Relatorio()
    val lista = Banco()

    //Teste da conta corrente
    var cc: ContaBancaria = ContaCorrente()
    cc.numeroConta = 123
    cc.depositar(valor = 500.00)
    print(cc.mostrarDados())
    cc.sacar(valor = 100.00)
    print(cc.mostrarDados())
    cc.sacar(valor = 200.00)
    print(cc.mostrarDados())
    cc.sacar(valor = 200.00)
    print(cc.mostrarDados())

    //Teste da conta poupança
    var cp: ContaBancaria = ContaPoupanca()
    cp.numeroConta = 654
    cp.depositar(valor = 50.00)
    relatorio.gerarRelatorio(cp)
    cp.sacar(valor = 1000.00)
    relatorio.gerarRelatorio(cp)
    cp.sacar(valor = 200.00)
    relatorio.gerarRelatorio(cp)
    cp.depositar(valor = 100.00)
    relatorio.gerarRelatorio(cp)

    //Teste das transferências
    var contCorrente: ContaBancaria = ContaCorrente()
    var contPoupanca: ContaBancaria = ContaPoupanca()

    contCorrente.numeroConta = 321
    contPoupanca.numeroConta = 987

    contCorrente.depositar(valor = 1000.00)
    relatorio.gerarRelatorio(contCorrente)
    contCorrente.transferir(valor = 600.00,contCorrente, contPoupanca)
    relatorio.gerarRelatorio(contCorrente)
    relatorio.gerarRelatorio(contPoupanca)

    //Teste da lista
    lista.inserirConta(cc)
    lista.inserirConta(cp)
    lista.inserirConta(contPoupanca)
    lista.inserirConta(contCorrente)

    print(lista.iterarLista())
    println()
    lista.removerConta(cp)

    print(lista.iterarLista())
    println()

    print(lista.procurarConta(numeroConta = 987))


}

