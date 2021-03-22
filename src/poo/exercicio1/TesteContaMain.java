package poo.exercicio1;

public class TesteContaMain {
    
    public static void main(String[] args) {
        
        Conta contaCorrente = new ContaCorrente(123, 333, "Raquel W", 500, 600, 300);
        contaCorrente.depositar(120);
        System.out.println("Seu saldo é R$ " + contaCorrente.getSaldo());
        
        contaCorrente.sacar(100);
        System.out.println("Seu saldo é R$ " + contaCorrente.getSaldo());
        
        
        Conta contaPoupanca = new ContaPoupanca(456, 222, "Bruno W", 1500, 890, 1000);
        contaPoupanca.depositar(400);
        System.out.println("\nSeu saldo é R$ " + contaPoupanca.getSaldo());
        
        contaPoupanca.sacar(100);
        System.out.println("Seu saldo é R$ " + contaPoupanca.getSaldo());
    }

}
