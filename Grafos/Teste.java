
public class Teste {

    public static void main(String[] args) {

        Vertice v1 = new Vertice(1);
        Vertice v2 = new Vertice(2);
        Vertice v3 = new Vertice(3);
        Vertice v4 = new Vertice(4);
        Vertice v5 = new Vertice(5);
        Vertice v6 = new Vertice(6);

        Aresta a1 = new Aresta();
        a1.adicionarAresta(v1, 1, 3);
        System.out.println("Origem: " + v1.getOrigem() + " Destino: " + v1.getDestino());

        Aresta a2 = new Aresta();
        a2.adicionarAresta(v1, 1, 4);
        System.out.println("Origem: " + v1.getOrigem() + " Destino: " + v1.getDestino());

        Aresta a3 = new Aresta();
        a2.adicionarAresta(v1, 1, 2);
        System.out.println("Origem: " + v1.getOrigem() + " Destino: " + v1.getDestino());

        Aresta a4 = new Aresta();
        a4.adicionarAresta(v1, 1, 1);
        System.out.println("Origem: " + v1.getOrigem() + " Destino: " + v1.getDestino()+ "\n");
        
        Aresta a5 = new Aresta();
        a4.adicionarAresta(v2, 2, 1);
        System.out.println("Origem: " + v2.getOrigem() + " Destino: " + v2.getDestino());
        
        Aresta a6 = new Aresta();
        a6.adicionarAresta(v2, 2, 2);
        System.out.println("Origem: " + v2.getOrigem() + " Destino: " + v2.getDestino());
        
        Aresta a7 = new Aresta();
        a6.adicionarAresta(v2, 2, 4);
        System.out.println("Origem: " + v2.getOrigem() + " Destino: " + v2.getDestino());
        
        Aresta a8 = new Aresta();
        a6.adicionarAresta(v2, 2, 5);
        System.out.println("Origem: " + v2.getOrigem() + " Destino: " + v2.getDestino());
        
        Aresta a9 = new Aresta();
        a6.adicionarAresta(v2, 2, 6);
        System.out.println("Origem: " + v3.getOrigem() + " Destino: " + v3.getDestino()+"\n");
        
        Aresta a10 = new Aresta();
        a6.adicionarAresta(v3, 3, 1);
        System.out.println("Origem: " + v3.getOrigem() + " Destino: " + v3.getDestino());

        Aresta a11 = new Aresta();
        a6.adicionarAresta(v3, 3, 3);
        System.out.println("Origem: " + v3.getOrigem() + " Destino: " + v3.getDestino());
        
        Aresta a12 = new Aresta();
        a6.adicionarAresta(v3, 3, 4);
        System.out.println("Origem: " + v3.getOrigem() + " Destino: " + v3.getDestino());
        
        Aresta a13 = new Aresta();
        a6.adicionarAresta(v3, 3, 5);
        System.out.println("Origem: " + v3.getOrigem() + " Destino: " + v3.getDestino()+"\n");
        
        //..
    }
}
