package poo.p3.deques.encadeados;

public class DequeEncadeado {

    private Conta cabeca;
    private Conta rabo;
    private int inseridos;

    public void insertFirst(Conta elemento) {

        if (elemento == null) {
            System.out.println("insertFirst: Input parameter null.");
            return;
        }


        if(inseridos == 0) {
            cabeca = elemento;
            rabo = elemento;
        }

        else {
            Conta temp = cabeca;
            elemento.proximo = temp;
            cabeca = elemento;
        }

        inseridos++;

    }

    public void insertLast(Conta elemento) {

        if (elemento == null) {
            System.out.println("insertFirst: Conta NULL.");
            return;
        }

        if(inseridos == 0) {
            rabo = elemento;
            cabeca = elemento;
        }

        else {
            rabo.proximo = elemento;
        }

        inseridos++;
    }

    public Conta removeFirst() {
        Conta contaRemovida = cabeca;

        if(inseridos == 1) {
            Conta temp = cabeca;
            cabeca = rabo = null;

            if(inseridos == 0) {
                return null;
            }

            else {
                Conta ret = cabeca;
                cabeca = cabeca.proximo;
            }
        }
        
        inseridos--;
        return contaRemovida;
    }

    public Conta removeLast() {
        Conta contaRemovida = rabo;

        if(inseridos == 1) {
            cabeca = rabo = null;
        }

        if(inseridos == 0) {
            return null;
        }

        if(inseridos > 1) { 
            Conta temp = cabeca;
            while (temp.proximo != null) {
                if(temp.proximo.equals(rabo)) {
                    rabo = null;
                    rabo = temp;
                }
                temp = temp.proximo;
            }
        }
        
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

