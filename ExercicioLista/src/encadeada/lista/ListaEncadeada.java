package encadeada.lista;


public class ListaEncadeada {

    private No cabeca;
    private int inseridos;

    public void adicionaNoInicio(No elemento) {
        if(elemento == null) {
            System.out.println("Elemento nulo, não pode ser inserido");
            return;
        }

        if(inseridos == 0) {
            cabeca = elemento;
        } else {
            No temp = cabeca;
            cabeca = elemento;
            cabeca.proximo = temp;
        } 
        inseridos++;
    }

    public void adicionaNoFim(No elemento) {
        No temp = cabeca;

        if(elemento == null) {
            System.out.println("Elemento nulo, não pode ser inserido");
            return;
        }

        if(inseridos == 0) {
            cabeca = elemento;
        } else {
            while(temp.proximo != null) {
                temp = temp.proximo;
            }
            temp.proximo = elemento;
        }
        inseridos++;
    }

    public void insereNaPosicao(int pos, No elemento) {
        No temp = cabeca;

        if(elemento == null) {
            System.out.println("Elemento nulo, não pode ser inserido");
            return;
        }

        boolean validada = validaPosicao(pos);
        if(validada) {
            if(inseridos == 0 && pos == 0) {
                adicionaNoInicio(elemento);
            } else if(pos == inseridos) {
                adicionaNoFim(elemento);
            } else {
                for (int i = 0; i < inseridos-1; i++) {
                    temp = temp.proximo;
                } 
                No anterior = temp;
                temp = elemento;
                elemento.proximo = anterior;
            }
            inseridos++;

        } else {
            System.out.println("Posição inválida");
            return;
        }
    }

    public boolean validaPosicao(int pos) {
        if(pos >= 0 && pos <= inseridos) {
            return true;
        }
        return false;
    }

    public void removeNoInicio(No elemento) {
        if(elemento == null) {
            System.out.println("Elemento nulo, não pode ser inserido");
            return;
        }

        if(inseridos == 0) {
            System.out.println("Não há elementos para remover");
            return;

        } else if(inseridos == 1) {
            cabeca = null;

        } else {
            cabeca = null;
            cabeca = cabeca.proximo;
        }
        inseridos--;
    }

    public int getLength() {
        return inseridos;
    }

    public boolean isEmpty() {
        return inseridos == 0;
    }


}
