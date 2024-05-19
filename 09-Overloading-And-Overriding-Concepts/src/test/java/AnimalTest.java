package test.java;

import main.java.br.unipar.Animal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalTest {

    @Test
    public void testEmitirSom() {
        Animal animalzin = new Animal();

        // ChatGPT pra consulta, só consegui usando ByteArray com o Maven
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        animalzin.fazerSom();

        assertEquals("O animal faz um som\n", outContent.toString());
    }
}