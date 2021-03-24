package poo.exercicio1;

public final class ContaPoupanca extends Conta {

    private int saquesMensaisSemCobrancas;
    private static final double VALOR_DESCONTADO = 2.5;

    public ContaPoupanca() {
    }

    public ContaPoupanca(int agencia, int conta, String titular, int limite, double saldo, int valorLimite) {
        super(agencia, conta, titular, limite, saldo, valorLimite);
        this.saquesMensaisSemCobrancas = 0;
    }


    @Override
    public void sacar(int valor) {
        if(getSaldo() >= valor && valor > 0 && saquesMensaisSemCobrancas < 3) {
            double novoSaldo = getSaldo() - valor;
            setSaldo(novoSaldo);
            saquesMensaisSemCobrancas++;
            
        } else if(saquesMensaisSemCobrancas >= 3 ) {
            double novoValor = getSaldo() - (valor + ContaPoupanca.VALOR_DESCONTADO);
            setSaldo(novoValor);
            saquesMensaisSemCobrancas++;
        }
    }
}
