import java.util.LinkedList;
import java.util.Queue;

public class ControleDeAviao {

    Queue<Aviao> filaAvioes = new LinkedList<Aviao>();
    
    public int listarQuantidadeAvioesFila() {
        return filaAvioes.size();
    }
    
    public Aviao autorizarPartida() {
        Aviao partida = filaAvioes.poll();
        return partida;
    }
    
    public void adicionarNaFilaEspera(Aviao aviao) {
        filaAvioes.add(aviao);
    }
    
    public Queue<Aviao> listarAvioesEmEspera() {
        return filaAvioes;
    }

    public Aviao listarCaracteristicasDoPrimeiroAviao() {
        Aviao modelo = filaAvioes.peek();
        return modelo;
    }

}

