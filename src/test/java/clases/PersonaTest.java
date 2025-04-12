package clases;

import excepcionesPropias.KiteNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {

    Persona persona;

    @BeforeEach
    void setUpPersona(){
        persona = new Persona("Victor", "Sanz", "Carrascal", 25);

        persona.addCometa(new Cometa(18, "Madrid"));
        persona.addCometa(new Cometa(18, "Caraquiz"));
        persona.addCometa(new Cometa(18, "Torrevieja"));
    }

    @Test
    @DisplayName("Le paso una edad negativa para lanzar un error")
    void setEdadPersonaConEdadNegativa(){
        assertThrows(IllegalArgumentException.class, () -> persona.setEdad(-25));
    }

    @Test
    @DisplayName("La persona no tiene cometas")
    void personaSinCometas(){
        persona.eliminarTodasLasCometas();
        assertFalse(persona.tieneCometas());
    }

    @Test
    @DisplayName("La persona tiene Cometas")
    void personaConCometas(){
        assertTrue(persona.tieneCometas());
    }

    @Test
    @DisplayName("Intento eliminar una cometa que apunta a null (analogo a que no este inicializado el objeto)")
    void eliminarUnaCometaQueNoApunteANada(){
        assertThrows(NullPointerException.class, () -> persona.eliminarCometa(null));
    }

    @Test
    @DisplayName("Intento eliminar una cometa que la persona no tiene")
    void eliminarCometaInexistente(){
        assertThrows(KiteNotFoundException.class, () -> persona.eliminarCometa(new Cometa(18, "Segovia")));
    }

    @Test
    @DisplayName("Tras añadir 3 cometas mas a la persona")
    void ahoraTieneSeisCometas(){

        //esto solo afecta localmente, en los demas test la persona sigue teniendo 3 cometas
        persona.addCometa(new Cometa(18, "Segovia"));
        persona.addCometa(new Cometa(18, "Pontevedra"));
        persona.addCometa(new Cometa(18, "Santander"));

        assertEquals(6, persona.cantidadCometas());
    }

    @Test
    @DisplayName("Tiene cometa en Madrid")
    void cometaEnMadrid(){
        assertTrue(persona.ubicacionConCometa("Madrid"));
    }

    @Test
    @DisplayName("Tiene cometa en Valladolid")
    void cometaEnValladolid(){
        assertFalse(persona.ubicacionConCometa("Valladolid"));
    }

    @Test
    @DisplayName("Al eliminar la cometa con ubicación en Caraquiz, la persona no debe de tener cometas en Caraquiz")
    void ahoraNoTieneCometasEnCaraquiz(){
        persona.eliminarCometa(new Cometa(18, "Caraquiz"));

        assertFalse(persona.ubicacionConCometa("Caraquiz"));
    }



}