import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NombreyEdadTest {
    private final PrintStream standarOut = System.out;
    private final ByteArrayOutputStream ouutputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(ouutputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standarOut);
    }
    @Test
    void testMain() {
        NombreyEdad.main(new String[1]);
        String salida = ouutputStreamCaptor.toString();
        assertEquals("El nombre es: Juan y la edad es: 25\r\n", salida);

    }
}
