
public class TestaControle {

    public static void main(String[] args) {

        Aviao a1 = new Aviao("Capacidade máxima 300 pessoas. Classe executiva e economica", "MAX 75757");
        Aviao a2 = new Aviao("Capacidade máxima 20 pessoas", "Jatinho particular");
        Aviao a3 = new Aviao("Capacidade máxima 115 pessoas. Classe executiva e luxo", "MAX 123");
        Aviao a4 = new Aviao("Capacidade máxima 8 pessoas", "Particular");
        Aviao a5 = new Aviao("Capacidade máxima 100 pessoas. Classe economica", "Boing 222");

        ControleDeAviao control = new ControleDeAviao();
        control.adicionarNaFilaEspera(a1);
        control.adicionarNaFilaEspera(a2);
        control.adicionarNaFilaEspera(a3);
        control.adicionarNaFilaEspera(a4);
        control.adicionarNaFilaEspera(a5);

        Aviao proximo = control.autorizarPartida();
        System.out.println("Partida autorizada para o avião " + proximo.getModelo()+ "\n");

        System.out.println("Aviões na fila de espera: " + control.listarQuantidadeAvioesFila()+"\n");

        System.out.println("LISTAR AS CARACTERÍSTICAS DO PROXIMO AVIÃO..");
        System.out.println("Modelo: " + control.listarCaracteristicasDoPrimeiroAvião().getModelo());
        System.out.println("Características do avião " + control.listarCaracteristicasDoPrimeiroAvião().getCaracteristicasAviao());

        /**2 Uma fila implementa o mecanismo de inserção/remoção:
              FIFO **/
        
    }

}
