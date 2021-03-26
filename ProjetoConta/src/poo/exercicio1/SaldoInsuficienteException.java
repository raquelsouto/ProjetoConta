package poo.exercicio1;

public class SaldoInsuficienteException extends Exception {

    private double valor = 0;
    
    public SaldoInsuficienteException (String error) {
        super(error);
    }
    
    public SaldoInsuficienteException(String error, double valor) {
        super(error);
        this.valor = valor;
    }
    
    public double getValor() {
        return this.valor;
    }

}
