//CODIGO ELABORADO POR EL ALUMNO DANIEL RICARDO RAMIREZ MOLINA

package view;

import control.ControlTienda;
import model.Autor;
import model.Libro;

public class Main {
    
    public static void main(String[] args) {
        ControlTienda controlador = new ControlTienda();
        
        controlador.getLibros().add(new Libro("El coronel no tiene quien le escriba", "bla bla bla", 12f, 2000, new Autor("Gabriel", "Garcia"), 100));
        controlador.getLibros().add(new Libro("Cien anios de soledad", "bla bla bla", 12f, 2000, new Autor("Gabriel", "Garcia"), 100));
        controlador.getLibros().add(new Libro("El olor de la guayaba", "bla bla bla", 12f, 2000, new Autor("Gabriel", "Garcia"), 100));
        
        System.out.println("\nProbando funcionalidad <<Crear libro>>");
        controlador.getLibros().add(controlador.crearLibro());
        System.out.println("\nProbando funcionalidad <<Listar libros por autor>>");
        controlador.listarLibrosxAutor("Gabriel", "Garcia");
        System.out.println("\nProbando funcionalidad <<Detallar libro>>");
        controlador.detallarLibro("El olor de la guayaba");
    }
    
}
