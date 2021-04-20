import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Banco {

    private List<Conta> listDeContas = new ArrayList<Conta>();
    private Map<String, Conta> mapaDeContas = new HashMap<String, Conta>();

    public void adicionar (Conta conta) {
        mapaDeContas.put(conta.getTitular(), conta);
    }

    public Conta pegar(int numero) {
        return listDeContas.get(numero);

    }

    public int pegarTotalDeContas() {
        return mapaDeContas.size();
    }
    
    public Conta buscarPorNome(String nome) {
        return mapaDeContas.get(nome);
    }

}
