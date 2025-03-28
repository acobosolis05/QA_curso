package com.airam;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

class ApplicationTest {

    @Test
    void createMockObject() {
        // Crear un mock de List
        List<String> mockedList = Mockito.mock(List.class);
        
        // Verificar que el tamaño predeterminado es 0
        assertEquals(0, mockedList.size());
    }
    @Test
    void configureMockObject2() {
        // Crear un mock de List
        List<String> mockedList = Mockito.mock(List.class);
        
        // Configurar el mock para que size() devuelva 5
        Mockito.when(mockedList.size()).thenReturn(5);
        
        // Verificar que el tamaño configurado es 5
        assertEquals(5, mockedList.size());
    }
    @Test
    void verificarMetodo() {
        List<String> mockedList = Mockito.mock(List.class);
        mockedList.add("prueba");
        // Verificación de la interacción
        verify(mockedList).add("prueba");
    }
    @Test
    public void crearObjetoEspia() {
        // Creación del espía a partir de un ArrayList real
        List<String> spyList = spy(new ArrayList<>());
        // Interacción con el espía
        spyList.add("uno");
        spyList.add("dos");
        // Verificación de la interacción
        verify(spyList).add("uno");
        // Prueba
        assertEquals(2, spyList.size());
        Mockito.when(spyList.size()).thenReturn(3);
        assertEquals(3, spyList.size());
    }
}
