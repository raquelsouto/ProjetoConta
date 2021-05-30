
public class Teste {

    public static void main(String[] args) {

        int listaDeInteiros[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
        
        System.out.println("Lista antes da ordenação..");
        for (int i = 0; i < listaDeInteiros.length; i++) {
            System.out.print(listaDeInteiros[i] + ", ");
        }
        
        System.out.println("");
        System.out.println("\nLista após a ordenação..");
        
        BubbleSort.ordernaLista(listaDeInteiros);
        
        for (int i = 0; i < listaDeInteiros.length; i++) {
            System.out.print(listaDeInteiros[i] + ", ");
        }
    }
}
