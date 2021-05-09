package poo.p3.deques.encadeados;

public class TesteDequeEncadeado {

    public static void main(String[] args) {
        
        Conta c = new Conta(1234, 44998, "Maria Flor", 7510);
        Conta c1 = new Conta(111, 77845, "Maria Madalena", 1500);
        Conta c2 = new Conta(787, 996874, "Junior", 985);
        
        Conta c3 = new Conta(445, 123456, "Paulo", 757);
        Conta c4 = new Conta(777, 123577, "Gustavo", 111);

        DequeEncadeado de = new DequeEncadeado();
        
        System.out.println("Quantidade de Contas adicionadas " + de.getLength());
        System.out.println("\nInserção pela frente..\n");
        de.insertFirst(c);
        de.insertFirst(c1);
        de.insertFirst(c2);
        System.out.println("Quantidade de Contas adicionadas " + de.getLength());
        
        de.insertLast(c3);
        de.insertLast(c4);
        System.out.println("\nQuantidade de Contas adicionadas " + de.getLength());
        
        Conta cc1 = de.removeFirst();
        System.out.println("A conta removida é " + cc1.getTitular());
    }

}
