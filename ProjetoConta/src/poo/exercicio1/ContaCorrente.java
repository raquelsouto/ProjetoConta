package poo.exercicio1;

public final class ContaCorrente extends Conta {
    
    public ContaCorrente(int agencia, int conta, String titular, int limite, int valorLimite) {
        super(agencia, conta, titular, limite, valorLimite);
    }
    
    public ContaCorrente(int agencia, int conta, String titular, int limite, int valorLimite, double saldo) {
       super(agencia, conta, titular, limite, valorLimite, saldo);
    }
    
    @Override
    public void sacar(int valor) throws SaldoInsuficienteException, IllegalArgumentException {
        if(getSaldo() >= valor && valor > 0) {
            double saldo = getSaldo() - valor;
            setSaldo(saldo);
            
        } else if (valor < 0){
            throw new IllegalArgumentException("Valor para saque inválido!");
            
        } else if (valor > getSaldo()) {
            throw new SaldoInsuficienteException("Erro. Saldo Insuficiente!", getSaldo());
        }
    }

}
