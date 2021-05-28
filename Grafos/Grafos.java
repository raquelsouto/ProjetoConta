public class Grafos {
    
    private static int matrizGrafo [][] = {
            {1, 1, 1, 1, 0, 0}, 
            {1, 1, 0, 1, 1, 1}, 
            {1, 0, 1, 1, 1, 0}, 
            {1, 1, 1, 1, 1, 0}, 
            {0, 0, 1, 1, 1, 1},
            {0, 1, 0, 0, 1, 1}};
    
    public static void main(String[] args) {
        
        for (int i = 0; i < matrizGrafo.length; i++) {
            for (int j = 0; j < matrizGrafo.length; j++) {
                System.out.print(matrizGrafo[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        
    }
    
}

