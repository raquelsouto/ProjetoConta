
public class Aresta {

    private int peso;
    private boolean direcionado = true;
    
    public Aresta() {}
    
    public void adicionarAresta(Vertice v, int valor1, int valor2) {
        v.setOrigem(valor1);
        v.setDestino(valor2);
    }

    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public boolean isDirecionado() {
        return direcionado;
    }
    public void setDirecionado(boolean direcionado) {
        this.direcionado = direcionado;
    }



}
