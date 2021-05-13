
public class TesteCalculadora {

    public static void main(String[] args) {
        
        Calculadora c = new Calculadora();
        Calculadora c1 = new Calculadora();
        Calculadora c2 = new Calculadora();
        Calculadora c3 = new Calculadora();
        
        System.out.println("Testando valores positivos..");
        System.out.println("O valor é: " + c.somatorio(3));
        
       System.out.println("\nO valor é: " + c1.somatorio(5));
        
        System.out.println("\nTestando valores negativos..");
        System.out.println("O valor é: " + c2.somatorio(-7));
        
        System.out.println("\nO valor é: " + c3.somatorio(-5));
    }

}

