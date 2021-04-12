import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

    public static void main(String[] args) {
        
        System.out.println("Iniciando...");

        //Testando o tempo de um ArrayList
        long inicio = System.currentTimeMillis();
        //Collection<Integer> testeTempo = new ArrayList<Integer>();
        
        //Testando o tempo de um HashSet (Muito mais rápido que o ArrayList)
        Collection<Integer> testeTempo = new HashSet<Integer>();
      
        int total = 30000;
        
        for (int i = 0; i < total; i++) {
            testeTempo.add(i);
        }
        
        for (int i = 0; i < total; i++) {
            testeTempo.contains(i);
        }
        
        long fim = System.currentTimeMillis();
        
        long tempo = fim - inicio;
        System.out.println("Tempo gasto: " + tempo);

        
        
        
    }

}
