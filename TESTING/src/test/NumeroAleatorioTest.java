import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class NumeroAleatorioTest {
    
    @ParameterizedTest
    @CsvSource({
            "1, 10", // Rango Normal
            "-10, 10", // Rango incluye negativos
            "5, 5", // Rango de min y max iguales
            "200, 300", // Números altos
            "10, 5" // Este caso debe lanzar una excepción
    })
    void testNumeroAleatorioEnRango(int min, int max) {
        if (min > max) {
            Assertions.assertThrows(IllegalArgumentException.class,
                    () -> NumeroAleatorio.numeroAleatorioEnRango(min, max));
        } else {
            Integer resultado = NumeroAleatorio.numeroAleatorioEnRango(min, max);
            Assertions.assertTrue(
                    resultado >= min && resultado <= max,
                    "El número generado está fuera del rango esperado.");
        }
    }

}
