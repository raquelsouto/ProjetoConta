
public class TestaBanco {
    
    public static void main(String[] args) {
        
        Conta c1 = new ContaPoupanca(258, "Bernardo", 2600);
        Conta c2 = new ContaCorrente(789, "Bruno", 16000);
        Conta c3 = new ContaCorrente(999, "Susy", 8000);
        
        Banco banco1 = new Banco();
        banco1.adicionar(c1);
        banco1.adicionar(c2);
        banco1.adicionar(c3);
        
        System.out.println("BUSCANDO INFORMAÇÕES DO CLIENTE POR NOME..\n");
        Conta cliente = banco1.buscarPorNome("Bruno");
        System.out.println(cliente);
        
        int quantidadeContas = banco1.pegarTotalDeContas();
        System.out.println("\nTotal de contas adicionadas: " + quantidadeContas);
    }

}
