package poo.exercicio1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TesteContas {
    
    private ContaCorrente contaCorrente;
    private ContaPoupanca contaPoupanca;

    @BeforeEach
    public void setup() {
        contaCorrente = new ContaCorrente(123, 333, "Raquel", 1000, 500, 700);
        contaPoupanca = new ContaPoupanca(321, 222, "Bruno", 2000, 1500, 1000);
    } 
    
    @Test
    void TesteSaqueContaCorrente() {
        assertEquals(500, contaCorrente.getSaldo());
    }
    
    @Test
    void TesteSaqueContaPoupanca() {
        assertEquals(1500, contaPoupanca.getSaldo());
    }

}
