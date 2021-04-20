
public class ContaCorrente extends Conta {

    ContaCorrente(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular,saldo);
    }

    @Override
    public void sacar(int valor) {
        if(getSaldo() >= valor && valor > 0) {
            setSaldo(this.getSaldo() - valor);
        }
    }
    
}
