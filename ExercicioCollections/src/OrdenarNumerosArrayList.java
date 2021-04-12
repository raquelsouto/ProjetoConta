import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenarNumerosArrayList {
    
    public static void main(String[] args) {
        
        List<Integer> listaNumeros = new ArrayList<Integer>();
        
        for (int j = 1; j <= 1000; j++) {
            listaNumeros.add(j);
        }
        
        System.out.println("EM ORDEM CRESCENTE");
        Collections.sort(listaNumeros);
        System.out.println(listaNumeros);
        
        //Modo1: Colocando em ordem Decrescente
        Collections.reverse(listaNumeros);
        
      //Modo2: Colocando em ordem Decrescente
        Collections.sort(listaNumeros, Collections.reverseOrder());
        System.out.println("EM ORDEM DECRESCENTE");
        System.out.println(listaNumeros);
        }
        
}
