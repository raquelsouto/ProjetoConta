
public class BubbleSort {

    public static void main(String[] args) {

        int listInteiros[] = {21, 4, 11, 5, 2, 1};

        int temp = 0;
        for (int i = 0; i < listInteiros.length; i++) {
            for (int j = 0; j < listInteiros.length-1-i; j++) {
                if(listInteiros[j] > listInteiros[j+1]) {
                    temp = listInteiros[j];
                    listInteiros[j] = listInteiros[j+1];
                    listInteiros[j+1] = temp;
                }
            }
        }

        System.out.println("");
        for (int i = 0; i < listInteiros.length; i++) {
            System.out.print(listInteiros[i] + " ");
        }
    }
}


