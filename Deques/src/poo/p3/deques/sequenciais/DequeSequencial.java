package poo.p3.deques.sequenciais;

public class DequeSequencial {

    private static final int ALOCACAO_INICIAL = 3;
    private Conta[] arrayInterno = new Conta[ALOCACAO_INICIAL];
    private int inseridos = 0;


    private void aumentarLimite() {
        if(inseridos == arrayInterno.length) {
            Conta[] listaMaior = new Conta[arrayInterno.length + ALOCACAO_INICIAL];

            for (int i = 0; i < arrayInterno.length; i++) {
                listaMaior[i] = arrayInterno[i];
            }
            arrayInterno = listaMaior;
        }
    }
        

    public void insertFirst(Conta elemento) {
        
        if (elemento == null) {
            System.out.println("insertFirst: Conta NULL.");
            return;
        }
        
        if(arrayInterno.length == inseridos) {
            aumentarLimite();
        }

        if(arrayInterno[0] == null) {
            arrayInterno[0] = elemento;
        } else {
            for (int i = arrayInterno.length-1; i > 0; i--) {
                arrayInterno[i] = arrayInterno[i - 1];
            }
            arrayInterno[0] = elemento;
        }
        
        inseridos++;
    }

    public void insertLast(Conta elemento) {
        
        if (elemento == null) {
            System.out.println("insertFirst: Conta NULL.");
            return;
        }
        
        if(arrayInterno.length == inseridos) {
            aumentarLimite();
        }

        if(arrayInterno[0] == null) {
            arrayInterno[0] = elemento;
        } else {
            arrayInterno[inseridos] = elemento;
        }
        
        inseridos++;
    }
    

    public Conta removeFirst() {
        return null;
    }

    public Conta removeLast() {
        return null;
    }

    public int tamanho() {
        return inseridos;
    }

    public boolean isEmpty() {
        return inseridos == 0;
    }

    public int getLength() {
        return arrayInterno.length;
    }

}
