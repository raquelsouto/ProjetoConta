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
            elemento.setProximo(cabeca);
        }

        else {
            Conta temp = cabeca;
            cabeca = elemento;
            elemento.setAnterior(temp);
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
            rabo.setProximo(elemento);
        }

        inseridos++;

    }

    public Conta removeFirst() {
        Conta contaRemovida = cabeca;
        
        if(inseridos == 0) {
            return null;
        }
        
        else {
            Conta temp = cabeca;
            cabeca = null;
            temp.setProximo(cabeca);
        }
        inseridos--;
        return contaRemovida;
    }

    public Conta removeLast() {
        Conta contaRemovida = rabo;
        
        if(inseridos == 0) {
            return null;
        }
        
        else {
            Conta temp = rabo.getAnterior();
            rabo = null;
            rabo = temp;         
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

