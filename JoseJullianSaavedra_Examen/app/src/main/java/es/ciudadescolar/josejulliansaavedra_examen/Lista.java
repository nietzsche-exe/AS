package es.ciudadescolar.josejulliansaavedra_examen;

public class Lista {

    private String nombre;

    private int numeroAleatorio;

    public Lista(String nombre, int numeroAleatorio) {
        this.nombre = nombre;
        this.numeroAleatorio = numeroAleatorio;
    }

    public Lista(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroAleatorio() {
        return numeroAleatorio;
    }

    public void setNumeroAleatorio(int numeroAleatorio) {
        this.numeroAleatorio = numeroAleatorio;
    }
}
