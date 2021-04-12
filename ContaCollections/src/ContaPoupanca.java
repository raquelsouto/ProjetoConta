import java.lang.Comparable;
import java.util.Comparator;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca>{

    private int numeroConta;
    private String titular;
    private double saldo;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Utilize o critério de ordenar pelo número da conta 
    @Override
    public int compareTo(ContaPoupanca contaPoupanca) {
        
        if(this.numeroConta < contaPoupanca.getNumeroConta()) {
            return -1;
        } else if(this.numeroConta > contaPoupanca.getNumeroConta()) {
            return 1;
        }
        return 0;
    }
    
}
