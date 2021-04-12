
public abstract class Conta {

    private int numeroConta;
    private String titular;
    private double saldo;
    
    Conta(int numeroConta, String titular, double saldo){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }
    
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    
    public int getNumeroConta() {
        return numeroConta;
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

}
