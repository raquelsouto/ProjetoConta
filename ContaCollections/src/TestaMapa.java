import java.util.HashMap;
import java.util.Map;

public class TestaMapa {

    public static void main(String[] args) {

        Conta conta1 = new ContaCorrente(147, "Raquel", 1800);
        System.out.println("Saldo R$ " + conta1.getSaldo());
        System.out.println("=-=-= DEPOSITANDO R$ 200.. =-=-=");
        conta1.depositar(200);
        System.out.println(conta1 + "\n");
        
        Conta conta2 = new ContaCorrente(258, "Aurora", 3000);
        System.out.println("Saldo R$ " + conta2.getSaldo());
        System.out.println("=-=-= DEPOSITANDO R$ 100.. =-=-=");
        conta2.depositar(100);
        System.out.println(conta2+ "\n");
        
        Map mapaDeContas = new HashMap();
        mapaDeContas.put("Raquel", conta1);
        mapaDeContas.put("Aurora", conta2);
        
        
        System.out.println("TESTANDO MAP..");
        Conta contaRaquel = (Conta) mapaDeContas.get("Raquel");
        System.out.println("Número da Conta de Raquel: " + contaRaquel.getNumeroConta());
        System.out.println("Saldo R$: " + contaRaquel.getSaldo() + "\n");
        
        Conta ContaAurora = (Conta) mapaDeContas.get("Aurora");
        System.out.println("Número da Conta de Aurora: " + ContaAurora.getNumeroConta());
        System.out.println("Saldo R$: " + ContaAurora.getSaldo());

        
        }


}
