//CODIGO ELABORADO POR EL ALUMNO DANIEL RICARDO RAMIREZ MOLINA

package model;

public class Autor {
    private String nombre;
    private String apellido;

    public Autor() {
    }

    public Autor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

}
