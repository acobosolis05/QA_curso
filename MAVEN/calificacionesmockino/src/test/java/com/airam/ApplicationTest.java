package com.airam;

import org.junit.jupiter.api.Test;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Scanner;

import org.junit.jupiter.api.Assertions;

class ApplicationTest {

    @Test
    void testObtenerPuntuacion() {
        // Mockeamos Scanner Uso de mock(Scanner.class) → Simula un Scanner sin leer realmente de la consola.
        Scanner mockScanner = mock(Scanner.class);

        // Simulamos entrada de usuario simula que el usuario ingreso 92
        when(mockScanner.nextLine()).thenReturn("92");

        // Inyectamos el mock en Application inserta el scanner falso
        Application.setScanner(mockScanner);

        // Ejecutamos el método
        Integer resultado = Application.obtenerPuntuacion();

        // Verificamos el resultado 
        Assertions.assertEquals(92, resultado);

        // Verificamos que Scanner se usó solo una vez
        verify(mockScanner, times(1)).nextLine();
    }
}
