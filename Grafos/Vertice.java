import java.util.List;

public class Vertice {
    
    private int nome;
    public int origem;
    public int destino;
    private List<Aresta> arestas;
    
    public Vertice(int nome) {
        this.nome = nome;
    }
    
    public Vertice() {}
    
    void adicionarArestas(Aresta aresta) {
        arestas.add(aresta);
    }
    
    public int getNome() {
        return nome;
    }
    public void setNome(int nome) {
        this.nome = nome;
    }
    public List<Aresta> getArestas() {
        return arestas;
    }
    public void setArestas(List<Aresta> arestas) {
        this.arestas = arestas;
    }
    
    public int getDestino() {
        return destino;
    }
    
    public void setDestino(int destino) {
        this.destino = destino;
    }
    
    public int getOrigem() {
        return origem;
    }
    
    public void setOrigem(int origem) {
        this.origem = origem;
    }
    
    @Override
    public String toString() {
        String out = "";
        out+= "Origem: " + origem + " | Destino: " + destino; 
        return out;
    }

}
