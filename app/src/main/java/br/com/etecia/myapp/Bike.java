package br.com.etecia.myapp;

public class Bike {
    private String titulo;
    private String descricao;
    private int numRating;
    private String nota;
    private int imgBike;

    public Bike() {
    }

    public Bike(String titulo, String descricao, int numRating, String nota, int imgBike) {
        this.titulo = titulo;
        this.descricao = descricao;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
