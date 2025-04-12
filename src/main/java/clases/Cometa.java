package clases;

public final class Cometa {

    private int vientoMinimo;

    private String ubicacionUso;

    public Cometa(int vientoMinimo, String ubicacionUso) {
        setVientoMinimo(vientoMinimo);
        setUbicacionUso(ubicacionUso);
    }

    public int getVientoMinimo() {
        return vientoMinimo;
    }

    public void setVientoMinimo(int vientoMinimo) {
        if (vientoMinimo <= 10)
            throw new IllegalArgumentException("Argumento no valido");
        this.vientoMinimo = vientoMinimo;
    }



    public String getUbicacionUso() {
        return ubicacionUso;
    }

    public void setUbicacionUso(String ubicacionUso) {
        this.ubicacionUso = ubicacionUso;
    }


    public boolean vuela(int velocidadViento) {
        if (velocidadViento < 0)
            throw new IllegalArgumentException("La velocidad del viento no puede ser negativa");
        return velocidadViento >= vientoMinimo;
    }

    /*ojo, no estoy sobreescribiendo el método equals, estoy sobrecargando el método equals, ya que el método equals
    recibe un Object (la madre de todas las clases de java)*/
    public boolean equals(Cometa cometa){
        return cometa.getUbicacionUso().equals(ubicacionUso) && cometa.getVientoMinimo() == vientoMinimo;
    }


    @Override
    public String toString() {
        return "clases.Cometa{" +
                "vientoMinimo=" + vientoMinimo +
                ", ubicacionUso='" + ubicacionUso + '\'' +
                '}';
    }




}
