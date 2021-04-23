import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TesteMeuArray {
    
    private List<Aluno> alunosList;
    
    @BeforeEach
    public void setup() {
        alunosList = new ArrayList<Aluno>();
    }
    
    @Test
    public void add() {
        assertEquals(0, alunosList.size());
        
        alunosList.add(new Aluno("Ana"));
        alunosList.add(new Aluno("Maria"));
        alunosList.add(new Aluno("Wesley"));
        
        assertEquals(3, alunosList.size());
        
    }
    
    @Test
    public void size() {
        assertEquals(0, alunosList.size());
        alunosList.add(new Aluno("Raquel"));
        
        assertTrue(alunosList.size() > 0);
    }
    
    @Test
    public void isEmpty() {
        assertEquals(true, alunosList.isEmpty());
        
        alunosList.add(new Aluno("Mariana"));
        alunosList.add(new Aluno("Daniel"));
        assertEquals(false, alunosList.isEmpty());
    }



}
