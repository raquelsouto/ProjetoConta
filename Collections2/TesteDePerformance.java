package p3.dados.de.estrutura.exercicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class TesteDePerformance {
    
    public static void main(String[] args) {
        
/** 1. Escreva um programa que compare o
desempenho das classes HashSet e
ArrayList. A comparação deve ser feita
medindo os tempos de inserção, remoção,
obtenção e navegação. **/
        
        
        long start = System.currentTimeMillis();
        
        List<String> listaSequencial = new ArrayList<String>();
        
        //Inserção
        for (int i = 0; i < 100; i++) {
            listaSequencial.add("Elemento: " + i);
        }
      //Remoção
        listaSequencial.remove(99);
        
        //Obtenção do elemento da primeira posição da lista
        String primeiraPosicao = listaSequencial.get(0);
        
        //Navegação
        for (String elemento : listaSequencial) {
            System.out.println(elemento);
        }

        long finish = System.currentTimeMillis();
        long tempo = finish - start;
        System.out.println("Tempo ArrayList = " + tempo);
        
        //Para HashSet
        
        start = System.currentTimeMillis();
        
        HashSet<String> conjunto = new HashSet<String>();
        
        //Inserção
        for (int i = 0; i < 100; i++) {
            conjunto.add("Elemento: " + i);
        }

        //Remoção
        conjunto.remove("elemento 0");
        
        //Navegação
        for (String elemento : conjunto) {
            System.out.println(elemento);
        }
        
        finish = System.currentTimeMillis();
        tempo = finish - start;
        System.out.println("Tempo HashSet = " + tempo);
        
    }
    
}
