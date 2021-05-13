
public class Calculadora {

    public int acumulador;

    public int somatorio(int n) {
        acumulador += n;

        if(n > 0) { 
            acumulador = somatorio(n-1);
            
        } else if(n < 0) {
            acumulador = somatorio(n+1);
        }
        
        return acumulador;
    }

}

