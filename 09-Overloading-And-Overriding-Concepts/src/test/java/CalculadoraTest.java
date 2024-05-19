package test.java;

import main.java.br.unipar.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    @Test
    public void testSomarDoisValores() {
        Calculadora calculadora = new Calculadora();
        assertEquals(4, calculadora.somar(4, 4));
    }

    @Test
    public void testSomarTresValores() {
        Calculadora calculadora = new Calculadora();
        assertEquals(12, calculadora.somar(4, 4, 4));
    }
}
