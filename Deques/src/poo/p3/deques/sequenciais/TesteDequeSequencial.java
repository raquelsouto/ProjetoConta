package poo.p3.deques.sequenciais;

public class TesteDequeSequencial {
    
    public static void main(String[] args) {
        
        Conta c = new Conta(1234, 44998, "Maria Flor", 7510);
        Conta c1 = new Conta(111, 77845, "Maria Madalena", 1500);
        Conta c2 = new Conta(787, 996874, "Junior", 985);
        
        Conta c3 = new Conta(445, 123456, "Paulo", 757);
        Conta c4 = new Conta(777, 123577, "Gustavo", 111);
        
        DequeSequencial ds = new DequeSequencial();
        
        System.out.println("Inser��o pela frente..");
        System.out.println("Quantidade de pessoas " + ds.getLength());
        ds.insertFirst(c);
        ds.insertFirst(c1);
        ds.insertFirst(c2);
        System.out.println("Quantidade de pessoas adicionadas � " + ds.getLength());
        
        System.out.println("\nInser��o por tr�s..");
        ds.insertLast(c3);
        ds.insertLast(c4);
        System.out.println("\nAp�s a inser��o a quantidade �: " + ds.getLength());
        
        System.out.println("\nInser��o Contas (Maria Flor, Maria Madalena, J�nior, Paulo, Gustavo..)");
        Conta conta = ds.removeFirst();
        System.out.println("A conta removida � de " + conta.getTitular());
        
        System.out.println("\nAp�s a remo��o, a quantidade contas � " + ds.getLength());
        
        System.out.println("\nRemo��o por tr�s..");
        Conta conta1 = ds.removeLast();
        System.out.println("A conta removida � de " + conta1.getTitular() + "\n");
        
    }
}
