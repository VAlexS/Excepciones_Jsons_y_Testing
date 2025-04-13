package jsonsExamples;

import clases.Persona;

import static utilPropio.Operaciones.*;

public class JSONExample2 {

    public static void main(String[] args) {

        String json2 = readJSONFile("cometasPersona2");

        Persona persona2 = convertirJSONaObjeto(json2, Persona.class);


        System.out.println(persona2.getCometas().get(1).vuela(30));
    }
}
