package poo.exercicio1;

public abstract class Conta {
    
    private int agencia;
    private int conta;
    private String titular;
    private int limite;
    private double saldo;
    private int valorLimite;
    

    public Conta(int agencia, int conta, String titular, int limite, int valorLimite) {
        this.agencia = agencia;
        this.conta = conta;
        this.titular = titular;
        this.limite = limite;
        this.valorLimite = valorLimite;
    }
    
    public Conta(int agencia, int conta, String titular, int limite, int valorLimite, double saldo) {
        this(agencia, conta, titular, limite, valorLimite);
        this.saldo = saldo;
    }
    
    public abstract void sacar(int valor);
    
    public void depositar(int valor) {
        if(getSaldo() >= valor && valor > 0) {
            double saldo = getSaldo() + valor;
            setSaldo(saldo);
        }
    }
    
    public void setValorLimite(int valorLimite) {
        this.valorLimite = valorLimite;
    }
    
    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getValorLimite() {
        return valorLimite;
    }

    @Override
    public String toString() {
        String out = "";
        out+= "Agência: " + agencia + "\n";
        out+= "Nome do Titular: " + titular + "\n";
        out+= "Número da Conta: " + conta + "\n";
        out+= "Saldo Atual R$ " + saldo + "\n";
        out+= "Limite Atual R$ " + limite + "\n";
        out+= "Valor de limite oferecido pelo banco R$ " + valorLimite + "\n";
        return out;
    }

}

