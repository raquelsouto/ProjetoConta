import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenarNumerosArrayList {
    
    public static void main(String[] args) {
        
        List<Integer> listaNumeros = new ArrayList<Integer>();
        
        for (int j = 1; j <= 1000; j++) {
            listaNumeros.add(j);
        }
        
        //Colocando em ordem Decrescente
        Collections.reverse(listaNumeros);
        
        for (Integer integer : listaNumeros) {
            System.out.println(integer);
        }
        
    }

}
