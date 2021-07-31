//CODIGO ELABORADO POR EL ALUMNO DANIEL RICARDO RAMIREZ MOLINA

package control;

import java.util.ArrayList;
import java.util.Scanner;
import model.Autor;
import model.Libro;

public class ControlTienda {
    private ArrayList<Libro> libros;

    public ControlTienda() {
        this.libros = new ArrayList<>();
    }

    public ControlTienda(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    
    public Libro crearLibro(){
        int codigoError;
        String titulo;
        String descripcion;
        float precio;
        int anio;
        String nombre;
        String apellido;
        int numeroPags;
        Scanner sc = new Scanner(System.in);
        
        do
        {
            codigoError = 0;
            
            System.out.println("Ingrese el titulo del libro: ");
            titulo = sc.next();
            if(titulo.length() < 5 || titulo.length() > 100)
            {
                codigoError = 1;
            }
                

            System.out.println("Ingrese la descripcion del libro " + titulo + ": ");
            descripcion = sc.next();
            if(descripcion.length() > 200)
            {
                codigoError = 2;
            }
                 

            System.out.println("Ingrese el precio del libro " + titulo + ": ");
            precio = sc.nextFloat();
            if(precio < 0 || precio > 10000)
            {
                codigoError = 3;
            }
            
            System.out.println("Ingrese el anio de publicacion del libro " + titulo + ": ");
            anio = sc.nextInt();
            if(String.valueOf(anio).length() != 4 || anio > 2021)
            {
                codigoError = 4;
            }
                 
            System.out.println("Ingrese el nombre del autor del libro " + titulo + ": ");
            nombre = sc.next();

            System.out.println("Ingrese el apellido del autor del libro " + titulo + ": ");
            apellido = sc.next();
            
            System.out.println("Ingrese el numero de paginas del libro " + titulo + ": ");
            numeroPags = sc.nextInt();
            if(numeroPags < 0 || numeroPags > 1500)
            {
                codigoError = 5;
            }
            
            if(codigoError != 0)
            {
                switch(codigoError)
                {
                    case 1:
                        System.out.println("[ERROR]-El titulo debe tener minimo 5 caracteres y maximo 100 caracteres");
                        break;
                    case 2:
                        System.out.println("[ERROR]-La descripcion no puede tener más de 200 caracteres");
                        break;
                    case 3:
                        System.out.println("[ERROR]-El precio debe ser positivo, mayor a 10000 pesos y sin centavos");
                        break;
                    case 4:
                        System.out.println("[ERROR]-El anio de publicacion no debe ser superior al anio actual y debe tener 4 dígitos");
                        break;
                    case 5:
                        System.out.println("[ERROR]-El numero de paginas debe ser un numero positivo, inferior a 1500 paginas");
                        break;
                }
            }
        }
        while(codigoError != 0);
        sc.close();
        
        return new Libro(titulo, descripcion, precio, anio, new Autor(nombre, apellido), numeroPags);
    }
    
    public void listarLibrosxAutor(String nombre, String apellido){
        for(Libro l : libros) {
            if(nombre.compareTo(l.getAutor().getNombre()) == 0 && apellido.compareTo(l.getAutor().getApellido()) == 0)
            {
                System.out.println("-" + l.getTitulo());
            }
        }
    }
    
    public void detallarLibro(String titulo){
        for (Libro l : libros) {
            if(titulo.compareTo(l.getTitulo()) == 0)
            {
                System.out.println(l.getTitulo());
                System.out.println("-Descripcion: " + l.getDescripcion());
                System.out.println("-Precio: " + l.getPrecio());
                System.out.println("-Anio: " + l.getAnio());
                System.out.println("-Paginas: " + l.getNumeroPags());
            }
        }
    }
            
    
}