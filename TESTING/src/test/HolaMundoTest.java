import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HolaMundoTest {
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
        HolaMundo.main(new String[1]);
        String salida = ouutputStreamCaptor.toString();
        assertEquals("Hola Mundo\r\n", salida);
    }
}
