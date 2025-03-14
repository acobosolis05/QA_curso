import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NombreyEdad2Test {
    private InputStream standarIn = System.in;
    private final PrintStream standarOut = System.out;
    private final ByteArrayOutputStream ouutputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(ouutputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standarOut);
        System.setIn(standarIn);
    }

    @Test
    void testMain() {
        Integer edadPrueba = 70;
        String nombrePrueba = "Pedro";
        ByteArrayInputStream in = new ByteArrayInputStream((nombrePrueba + "\n" + edadPrueba + "\n").getBytes());
        System.setIn(in);
        NombreyEdad2.main(new String[0]);
        // Capturar la salida y eliminar saltos de línea inconsistentes
        String salida = ouutputStreamCaptor.toString();
        System.setOut(standarOut);
        assertEquals("Me llamo " + nombrePrueba + " y tengo " + edadPrueba + " años.\r\n", salida);
    }

    @Test
    void testObtenerEdad() {
        ByteArrayInputStream in = new ByteArrayInputStream("70\n".getBytes());
        System.setIn(in);
        Integer edadI = NombreyEdad2.obtenerEdad(new Scanner(System.in));
        Assertions.assertEquals(70, edadI);

    }

    @Test
    void testObtenerNombre() {
        ByteArrayInputStream in = new ByteArrayInputStream("Pedro\n".getBytes());
        System.setIn(in);
        String nombreI = NombreyEdad2.obtenerNombre(new Scanner(System.in));
        Assertions.assertEquals("Pedro", nombreI);
    }
}
