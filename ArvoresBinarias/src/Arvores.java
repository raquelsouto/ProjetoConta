
public class Arvores {

    private int folha;

    public int quantidadeFolhas(No no) {
        
        if(no.getDireita() == null && no.getDireita() == null) {
            folha++;
        } 

        if(no != null) {
            quantidadeFolhas(no.getEsquerda());
            quantidadeFolhas(no.getDireita());
        }
        return folha;
    }
}
