package clases;

import excepcionesPropias.KiteNotFoundException;

import java.util.ArrayList;
import java.util.List;

public final class Persona {

    private String nombre, apellido1, apellido2;
    private int edad;

    private final List<Cometa> cometas = new ArrayList<>();

    public Persona(String nombre, String apellido1, String apellido2, int edad) {
        setNombre(nombre);
        setApellido1(apellido1);
        setApellido2(apellido2);
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0)
            throw new IllegalArgumentException("La edad no puede ser negativa");
        this.edad = edad;
    }

    public List<Cometa> getCometas() {
        return cometas;
    }

    public void addCometa(Cometa cometa){
        if (cometa == null)
            throw new NullPointerException("Me has pasado una cometa que apunta a null");

        cometas.add(cometa);
    }

    public boolean ubicacionConCometa(String ubicacion){
        for (Cometa cometa : cometas)
            if (cometa.getUbicacionUso().equals(ubicacion))
                return true;
        return false;
    }


    public boolean tieneCometas(){
        return !cometas.isEmpty();
    }

    public int cantidadCometas(){
        if (tieneCometas())
            return cometas.size();
        else
            return 0;
    }

    public void eliminarCometa(Cometa cometa){
        if (cometa == null)
            throw new NullPointerException("Me has pasado una cometa que apunta a null");

        boolean eliminado = cometas.remove(cometa);

        if (!eliminado)
            throw new KiteNotFoundException("La cometa que has pasado no existe en la lista");
    }

    @Override
    public String toString() {
        return "clases.Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", edad=" + edad +
                ", cometas=" + cometas +
                '}';
    }
}
