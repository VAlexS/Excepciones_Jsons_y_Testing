package clases;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class DadoTest {

    @Test
    @DisplayName("Siempre menor que 7")
    void lanzarMenorQueSiete(){
        var dado = new Dado();

        assertTrue(dado.lanzar() < 7);
    }

    @Test
    @DisplayName("Comprobar que da 6 el mock")
    void lanzarSeis(){
        Dado mockDado = mock(Dado.class); //aquí creo un dado falso (pseudoDado)

        when(mockDado.lanzar()).thenReturn(6); //le estoy generando el comportamiento al pseudodado para que me devuelva 6

        System.out.println("Resultado del dado: "+mockDado.lanzar());

        assertEquals(6, mockDado.lanzar());
    }

    @Test
    @DisplayName("Mandar una excepcion")
    void lanzarEror(){
        Dado mockDado = mock(Dado.class); //aquí creo un dado falso (pseudoDado)

        when(mockDado.lanzar()).thenThrow(new RuntimeException("El dado esta roto"));

        assertThrows(RuntimeException.class, mockDado::lanzar);

    }



}