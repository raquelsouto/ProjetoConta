package poo.exercicio1;

public final class ContaCorrente extends Conta {
    
    public ContaCorrente() {
        
    }
    
    public ContaCorrente(int agencia, int conta, String titular, int limite, double saldo, int valorLimite) {
        super(agencia, conta, titular, limite, saldo, valorLimite);
    }
    
    @Override
    public void sacar(int valor) {
        if(getSaldo() >= valor && valor > 0) {
            double saldo = getSaldo() - valor;
            setSaldo(saldo);
        }
    }
    
}
