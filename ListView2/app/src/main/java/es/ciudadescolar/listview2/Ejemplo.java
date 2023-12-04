package es.ciudadescolar.listview2;

public class Ejemplo {

    private String titulo;
    private String subtitulo;
    private String urlFoto;
    private Integer numeroEjemplo;

    public Ejemplo(){

    }
    public Ejemplo(String titulo, String subtitulo, String urlFoto, Integer numeroEjemplo) {
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.urlFoto = urlFoto;
        this.numeroEjemplo = numeroEjemplo;
    }

    // GETTER Y SETTER
    public String getTitulo() {
        return titulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public int getNumeroEjemplo() {
        return numeroEjemplo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public void setNumeroEjemplo(Integer numeroEjemplo) {
        this.numeroEjemplo = numeroEjemplo;
    }
}
