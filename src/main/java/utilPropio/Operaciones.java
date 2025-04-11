package utilPropio;

import com.google.gson.*;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public final class Operaciones {

    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    //los metodos con <T> quiere decir que aceptan y devuelven cualquier cosa, para que sea más generico

    public static <T> String generateJson(T o){
        return gson.toJson(o);
    }

    public static void saveJSONtoFile(String json, String fileName){
        try {
            var writer = new FileWriter("src/main/resources/"+fileName+".json");

            writer.write(json);

            writer.close();
        } catch (IOException e) {
            System.out.println("Error de E/S");
            throw new RuntimeException(e);
        }
    }

    public static String readJSONFile(String fileName){
        try {
            String path = "src/main/resources/"+fileName+".json";
            return Files.readString(Path.of(path));
        } catch (IOException e) {
            System.out.println("Error de E/S");
            throw new RuntimeException(e);
        }
    }

    public static <T> T convertirJSONaObjeto(String json, Class<T> clase) {
        return gson.fromJson(json, clase);
    }

    public static JsonArray leerVariosObjetos(String fileName) {
        try {
            return gson.fromJson(new FileReader("src/main/resources/"+fileName+".json"), JsonArray.class);
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
            throw new RuntimeException(e);
        }
    }

    public static <T> List<T> generarListaObjetos(JsonArray jsonArray, Class<T> clase){

        List<T> objetos = new ArrayList<>();

        for (JsonElement jsonElement : jsonArray)
            objetos.add(convertirJSONaObjeto(jsonElement.toString(), clase));

        return objetos;
    }




}
