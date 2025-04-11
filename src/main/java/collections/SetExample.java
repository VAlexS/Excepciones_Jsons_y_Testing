package collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>(); //NO permite elementos repetidos

        set.add("Victor");
        set.add("Violeta");
        set.add("Manuel");
        set.add("Veronica");


        System.out.println(set);
    }
}
