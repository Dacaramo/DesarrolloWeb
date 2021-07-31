//CODIGO ELABORADO POR EL ALUMNO DANIEL RICARDO RAMIREZ MOLINA

package model;

public class Libro {
    private String titulo;
    private String descripcion;
    private float precio;
    private int anio;
    private Autor autor;
    private int numeroPags;

    public Libro() {
    }
    
    public Libro(String titulo, String descripcion, float precio, int anio, Autor autor, int numeroPags) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.anio = anio;
        this.autor = autor;
        this.numeroPags = numeroPags;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public int getAnio() {
        return anio;
    }

    public Autor getAutor() {
        return autor;
    }

    public int getNumeroPags() {
        return numeroPags;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    } 

    public void setNumeroPags(int numeroPags) {
        this.numeroPags = numeroPags;
    }
}
