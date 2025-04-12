package clases;

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

        persona.eliminarCometa(new Cometa(18, "Madrid"));
        persona.eliminarCometa(new Cometa(18, "Caraquiz"));
        persona.eliminarCometa(new Cometa(18, "Torrevieja"));

        assertFalse(persona.tieneCometas());
    }

    @Test
    @DisplayName("La persona tiene Cometas")
    void personaConCometas(){

        assertTrue(persona.tieneCometas());
    }

}