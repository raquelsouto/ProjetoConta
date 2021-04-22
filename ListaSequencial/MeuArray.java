import java.util.Arrays;

public class MeuArray {

    private Aluno[] alunos = new Aluno[100];
    private final int VALOR = 50;
    private int totalAlunos = 0;

    public void adiciona(Aluno aluno) {
        garanteEspacos();
        
        this.alunos[totalAlunos] = aluno;
        totalAlunos++;
    }
    
    public void adiciona(int posicao, Aluno aluno) {
        garanteEspacos();

        if(!posicaoValida(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        for (int i = totalAlunos - 1; i <= 0; i++) {
            alunos[i+1] = alunos[i];
        }
        
        alunos[posicao] = aluno;
        totalAlunos++;
    }
    
    public void garanteEspacos() {
        if(totalAlunos == alunos.length) {
            Aluno [] novosAlunos = new Aluno[alunos.length + VALOR];
            for (int i = 0; i < alunos.length; i++) {
                novosAlunos[i] = alunos[i];
            }
            
            alunos = novosAlunos;
        }
    }

    private boolean posicaoOcupada(int posicao) {
        return (posicao >= 0 && posicao < totalAlunos);
    }
    
    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao <= totalAlunos;
    }

    public Aluno pega(int posicao) {
        if(!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return alunos[posicao];
    }

    public void remove(int posicao) {
        for (int i = posicao; i < totalAlunos; i++) {
            alunos[i] = alunos[i + 1];
            totalAlunos--;
        }
    }

    public boolean contem(String aluno) {
        for (int i = 0; i < totalAlunos; i++) {
            if((alunos[i].getNome().equals(aluno))) {
                return true;
            }
        }
        return false;
    }

    public int tamanho() {
        return totalAlunos;
    }

    @Override
    public String toString() {
        return Arrays.toString(alunos);
    }

}
