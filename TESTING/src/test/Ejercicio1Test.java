import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Ejercicio1Test {
    

    @ParameterizedTest
    @ValueSource(ints = { 1, 2, 5, -3, 0, 10 }) // Valores de prueba
    void testDoble(int numero) {
        // Se calcula el resultado esperado
        int esperado = numero * 2;


        // Se verifica que el método retorne el valor esperado
        assertEquals(esperado, Ejercicio1.doble(numero));
    }
}


