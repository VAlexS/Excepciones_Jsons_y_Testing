package clases;

import java.util.Random;

public class Dado {

    //Esta clase es para hacer test con Mockito

    public int lanzar(){
        var random = new Random();
        return random.nextInt(6) + 1;
    }


}
