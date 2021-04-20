
public abstract class Conta {

    private int numeroConta;
    private String titular;
    private double saldo;
    
    Conta(int numeroConta, String titular, double saldo){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }
    
//    @Override
//    public int hashCode() {
//        int primo = 31;
//        int resultado = 1;
//        resultado = primo * resultado + numeroConta;
//        return resultado;
//    }
    
    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if(getClass() != obj.getClass()) {
            return false;
        }
        Conta outra = (Conta) obj;
        if(numeroConta != outra.numeroConta) {
            return false;
        }
        return true;
    }
    
    public abstract void sacar(int valor);
    
    public void depositar(double valor) {
        if(valor > 0) {
            double novoSaldo = getSaldo() + valor;
            setSaldo(novoSaldo);
        }
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
    
    @Override
    public String toString() {
        String out = "";
        out+= "Nome do titular: " + this.getTitular() + " | ";
        out+="Número da conta: " + this.getNumeroConta() + " | ";
        out+= "Saldo: R$ " + this.getSaldo();
        return out;
    }

}
