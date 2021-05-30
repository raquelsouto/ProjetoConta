public class BubbleSort {
    
    static int[] ordernaLista(int[] listInteiros) {
        int temp = 0;
        for (int i = 0; i < listInteiros.length-1; i++) {
            for (int j = 1; j < listInteiros.length; j++) {
                if(listInteiros[j-1] > listInteiros[j]) {
                    temp = listInteiros[j-1];
                    listInteiros[j-1] = listInteiros[j];
                    listInteiros[j] = temp;
                }
            }
        }
        return listInteiros;
    }
}


