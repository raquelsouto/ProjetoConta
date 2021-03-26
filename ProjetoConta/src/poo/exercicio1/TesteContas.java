package poo.exercicio1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TesteContas {
    
    private ContaCorrente contaCorrente;
    private ContaPoupanca contaPoupanca;

    @BeforeEach
    public void setup() {
        contaCorrente = new ContaCorrente(123, 333, "Raquel", 400, 500, 500);
        contaPoupanca = new ContaPoupanca(321, 222, "Bruno", 2000, 1000, 5000);
    } 
    
    @Test
    void TesteSaqueContaCorrente() {
        assertEquals(500, contaCorrente.getSaldo());
    }
    
    @Test
    void TesteSaqueContaPoupanca() {
        assertEquals(5000, contaPoupanca.getSaldo());
    }

}
