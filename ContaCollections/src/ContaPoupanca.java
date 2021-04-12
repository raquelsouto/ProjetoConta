import java.lang.Comparable;
import java.util.Comparator;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca>{

    ContaPoupanca(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular,saldo);
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
