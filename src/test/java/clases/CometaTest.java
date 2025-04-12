package clases;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CometaTest {

    Cometa cometa;

    @BeforeEach
    void setUpCometa(){
        cometa = new Cometa(18, "Madrid");
    }


    @Test
    @DisplayName("Compruebo si determina si la cometa vuela o no dada la velocidad actual del viento en km/h")
    void dadaLaVelocidadDelVientoComprueboSiLaCometaVuela() {
        assertTrue(cometa.vuela(30));
    }

    @Test
    @DisplayName("Si mando una velocidad del viento inferior, la cometa no debe volar")
    void conUnaVelocidadInferiorLaCometaNoVuela() {
        assertFalse(cometa.vuela(10));
    }

    @Test
    @DisplayName("Le paso una velocidad del viento negativa")
    void conUnaVelocidadDeVientoNegativaDebeLanzarUnaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> cometa.vuela(-20));
    }

    @Test
    @DisplayName("Modifico a la cometa la velocidad minima de viento requerida para que vuele, por debajo de 10, que es el minimo establecido")
    void minimoPorDebajoDeLoEstablecido() {
        assertThrows(IllegalArgumentException.class, () -> cometa.setVientoMinimo(8));
    }

    @Test
    @DisplayName("Le cambio el sitio donde vuelo esa cometa")
    void setUbicacionUso(){
        cometa.setUbicacionUso("Torrevieja");

        assertEquals("Torrevieja", cometa.getUbicacionUso());
    }


}