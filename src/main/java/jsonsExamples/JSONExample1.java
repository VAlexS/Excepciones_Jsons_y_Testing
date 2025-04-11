package jsonsExamples;

import clases.*;

import static utilPropio.Operaciones.*;


public class JSONExample1 {


    public static void main(String[] args) {


        Persona persona = new Persona("Victor", "Sanz", "Carrascal", 25);


        persona.addCometa(new Cometa(18, "Madrid"));
        persona.addCometa(new Cometa(18,"Caraquiz, Uceda (Guadalajara)"));
        persona.addCometa(new Cometa(18, "Torrevieja, Alicante"));



        String personaJson = generateJson(persona);

        saveJSONtoFile(personaJson, "cometasPersona1");

        /*String json2 = readJSONFile("cometasPersona2");

        Persona persona2 = convertirJSONaObjeto(json2, Persona.class);





        System.out.println(persona2.getCometas().get(1).vuela(30));*/












    }
}