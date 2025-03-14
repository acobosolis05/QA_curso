
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;



public class CalificacionTest {
    
    private InputStream standarIn = System.in;

    @AfterEach
    public void tearDown() {
        System.setIn(standarIn);
        Calificacion.lecturaDato = new Scanner(System.in);
    }
    
    // Prueba parametrizada para 'mensajePuntuacion'
    @ParameterizedTest
    @CsvFileSource(resources = "csv/mensajePuntuacion.csv", numLinesToSkip = 1)
    void testMensajePuntuacion(Integer puntuacionIngresada, String valorEsperado) {
        String resultado = Calificacion.mensajePuntuacion(puntuacionIngresada);
        Assertions.assertEquals(valorEsperado, resultado);
    }
    
    // Prueba parametrizada para 'obtenerNota'
    @ParameterizedTest
    @CsvFileSource(resources = "csv/puntuacionCalificacion.csv", numLinesToSkip = 1)
    void testObtenerClasificacion(Integer puntuacionIngresada, String valorEsperado) {
        String resultado = Calificacion.obtenerNota(puntuacionIngresada);
        Assertions.assertEquals(valorEsperado, resultado);
    }
    
    // Prueba de lectura de puntuación desde la entrada estándar
    @ParameterizedTest
    @CsvSource({"92, 92", "80, 80"})
    void testObtenerPuntuacion(String input, Integer valorEsperado) {
        ByteArrayInputStream in = new ByteArrayInputStream((input + "\n").getBytes());
        System.setIn(in);
        
        Calificacion.lecturaDato = new Scanner(System.in);
        Integer resultado = Calificacion.obtenerPuntuacion();
        
        Assertions.assertEquals(valorEsperado, resultado);
    }
    
}
