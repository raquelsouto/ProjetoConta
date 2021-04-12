import java.util.TreeSet;

public class OrdenarNumeros {
    
    public static void main(String[] args) {
        
        //Ordenar numeros em ordem decrescente usando o TreeSet
        TreeSet<Integer> numeros = new TreeSet<Integer>();
        
        for (int i = 1; i <= 1000; i++) {
            numeros.add(i);
        }
        
        for (Integer integer : numeros.descendingSet()) {
            System.out.println(integer);
        }
        
    }

}
