import java.lang.Comparable;
import java.util.Comparator;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca>{

    private final double JUROS_SAQUE = 0.65;

    ContaPoupanca(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }
    
    @Override
    public void sacar(int valor) {
        if(getSaldo() >= valor && valor > 0) {
            setSaldo(this.getSaldo() - (valor + JUROS_SAQUE));
        }
    }

    //Utilize o critério de ordenar pelo número da conta 
    @Override
    public int compareTo(ContaPoupanca contaPoupanca) {

        if(this.getNumeroConta() < contaPoupanca.getNumeroConta()) {
            return -1;
        } else if(this.getNumeroConta() > contaPoupanca.getNumeroConta()) {
            return 1;
        }
        return 0;
    }



}
