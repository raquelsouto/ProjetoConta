import java.util.HashSet;

public class TestaHashSetConta {
    
    public static void main(String[] args) {
        
        Conta cp1 = new ContaPoupanca(123, "Bruno", 100000000);
        Conta cp2 = new ContaPoupanca(145, "Daijane", 100.25);
        
        Conta cc1 = new ContaCorrente(456, "Maria Alice", 5000.58);
        Conta cc2 = new ContaCorrente(444, "Renata", 10000);
        Conta cc3 = new ContaCorrente(787, "Raquel", 2500.10);
        
        HashSet<Conta> listaHash = new HashSet<Conta>();
        listaHash.add(cp1);
        listaHash.add(cp2);
        listaHash.add(cc1);
        listaHash.add(cc2);
        listaHash.add(cc3);
        
        if(listaHash.contains(new ContaCorrente(444, "Renata", 10000))) {
            System.out.println("Essa conta existe!");
        } else {
            System.out.println("Conta não encontrada");
        }
    }
    
    /** Remova o método hashCode. Continua funcionando? 
    Não. O HashSet necessita de uma sobrecarga do método hashCode para funcionar **/

}
