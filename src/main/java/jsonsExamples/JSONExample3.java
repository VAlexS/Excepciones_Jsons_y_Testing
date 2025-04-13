package jsonsExamples;

import clases.Persona;

import java.util.List;

import static utilPropio.Operaciones.*;

public class JSONExample3 {


    public static void main(String[] args) {

        List<Persona> personas = generarListaObjetos(leerVariosObjetos("variasPersonas"), Persona.class);

        System.out.println(personas);

    }
}
