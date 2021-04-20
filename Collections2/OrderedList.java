package p3.dados.de.estrutura.exercicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class OrderedList {
    
/** 2. Implementar uma classe chamada
OrderedList que armazena os objetos em
uma lista, que deve ser passada no
construtor. Implemente métodos
semelhantes aos definidos na interface List. **/

    private ArrayList lista = new ArrayList();
    
    public OrderedList(ArrayList elementos) {
        lista = elementos;
    }
    
    public void adicionar(Object elemento) {
        lista.add(elemento);
        Collections.sort(lista);
        
    }
    
    public void remover(Object elemento) {
        lista.remove(elemento);
        Collections.sort(lista);
    }
    
    public void removerByIndex(int index) {
        lista.remove(index);
        Collections.sort(lista);
    }

}
