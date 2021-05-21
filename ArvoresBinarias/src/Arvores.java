
public class Arvores {

    private int folha;

    public void preOrdem(No no) {
        if(no != null) {
            System.out.println(no.getCodigo());
            preOrdem(no.getEsquerda());
            preOrdem(no.getDireita());
        }
    }

    public int quantidadeFolhas(No no) {
        preOrdem(no);
        
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
