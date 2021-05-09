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
            for (int i = 1; i > arrayInterno.length-1; i++) {
                arrayInterno[i] = arrayInterno[i+1];
            }
            
        }
        arrayInterno[0] = elemento;
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

        if(arrayInterno[arrayInterno.length-1] == null) {
            arrayInterno[arrayInterno.length-1] = elemento;
        } 
        else {
            arrayInterno[inseridos] = elemento;
        }

        inseridos++;
    }


    public Conta removeFirst() {
        Conta contaRemovida = null;
        
        if(inseridos == 0) {
            return null;
        } 
        
        contaRemovida = arrayInterno[0];
        arrayInterno[0] = null;

        for (int i = 0; i < arrayInterno.length-1; i++) {
            arrayInterno[i] = arrayInterno[i+1];
        }
        
        inseridos--;
        
        return contaRemovida;
    }

    public Conta removeLast() {
        Conta contaRemovida = null;
        
        if(inseridos == 0) {
            return null;
        } 
        
        contaRemovida = arrayInterno[inseridos-1];
        arrayInterno[inseridos-1] = null;
        
        inseridos--;
        
        return contaRemovida;
    }

    public int getLength() {
        return inseridos;
    }

    public boolean isEmpty() {
        return inseridos == 0;
    }



}
