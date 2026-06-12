package br.com.etecia.myapp;

public class Bike {
    private String titulo;
    private String subTitulo;
    private int numRating;
    private String nota;
    private int imgBike;

    public Bike(String titulo, String subTitulo, int numRating, String nota, int imgBike) {
        this.titulo = titulo;
        this.subTitulo = subTitulo;
        this.numRating = numRating;
        this.nota = nota;
        this.imgBike = imgBike;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubTitulo() {
        return subTitulo;
    }

    public void setSubTitulo(String subTitulo) {
        this.subTitulo = subTitulo;
    }

    public int getNumRating() {
        return numRating;
    }

    public void setNumRating(int numRating) {
        this.numRating = numRating;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public int getImgBike() {
        return imgBike;
    }

    public void setImgBike(int imgBike) {
        this.imgBike = imgBike;
    }
}
