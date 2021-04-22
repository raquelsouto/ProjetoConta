
public class MeuArrayTeste {
    
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno("João");
        Aluno a2 = new Aluno("José");
        Aluno a3 = new Aluno("Maria");
        Aluno a4 = new Aluno("Madalena");
        
        MeuArray lista = new MeuArray();
        
        lista.adiciona(a1);
        lista.adiciona(a2);
        lista.adiciona(a3);
        System.out.println(lista);
        
        System.out.println("\nQuantidade de alunos na lista: " + lista.tamanho());
        
        System.out.println("\nContém este aluno na lista?");
        System.out.println(lista.contem("Maria"));
        
        System.out.println("Pega o Aluno na posição correspondente");
        System.out.println(lista.pega(1) + "\n");
        
        System.out.println("Adicionar Madalena na posição 0");
        lista.adiciona(0, a4);
        System.out.println(lista);
        
        System.out.println("\nRemovendo um aluno");
        lista.remove(2);
        System.out.println(lista+"\n");
        
        
        System.out.println("Deixando a lista mais dinâmica");
        for (int i = 0; i < 111; i++) {
            Aluno aluno = new Aluno("João: " + i);
            lista.adiciona(aluno);
        }
        System.out.println(lista);
    }

}
