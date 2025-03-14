package com.airam;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;



import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;

class ApplicationTest {

    private InputStream standarIn = System.in;

    @AfterEach
    public void tearDown() {
        System.setIn(standarIn);
    }
    
    // Prueba parametrizada para 'mensajePuntuacion'
    @ParameterizedTest
    @CsvFileSource(resources = "/csv/mensaje-puntuacion.csv", numLinesToSkip = 1)
    void testMensajePuntuacion(Integer puntuacionIngresada, String valorEsperado) {
        String resultado =Application.mensajePuntuacion(puntuacionIngresada);
        Assertions.assertEquals(valorEsperado, resultado);
    }
    
    // Prueba parametrizada para 'obtenerNota'
    @ParameterizedTest
    @CsvFileSource(resources = "/csv/puntuacion-calificacion.csv", numLinesToSkip = 1)
    void testObtenerClasificacion(Integer puntuacionIngresada, String valorEsperado) {
        String resultado = Application.obtenerNota(puntuacionIngresada);
        Assertions.assertEquals(valorEsperado, resultado);
    }
    
    // Prueba de lectura de puntuación desde la entrada estándar
    @ParameterizedTest
    @CsvSource({"92, 92", "80, 80"})
    void testObtenerPuntuacion(String input, Integer valorEsperado) {
        ByteArrayInputStream in = new ByteArrayInputStream((input + "\n").getBytes());
        System.setIn(in);
        
        Application.lecturaDato = new Scanner(System.in);
        Integer resultado = Application.obtenerPuntuacion();
        
        Assertions.assertEquals(valorEsperado, resultado);
    }
}
