/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacioncontinua;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ferriol Babures
 */
public class Autor {
    private String nombre;
    private List<Libro> librosAutor;
    
    /*Constructor*/
    
    public Autor(String nombre){
        this.nombre = nombre;
        this.librosAutor = new ArrayList<>();
    }
    
    /*Métodos*/
    
    /*Get y Set*/
    
    /*Para el nombre*/
    public String getNombreAutor(){
        return nombre;
    }
    
    public void setNombreAutor(String nombre){
        this.nombre = nombre;
    }
    
    /*Para la lista de libros del autor*/
    public List<Libro> getLibrosAutor(){
        return librosAutor;
    }
    
    public void setLibrosAutor(List librosAutor){
        this.librosAutor = librosAutor;
    }
    
    
    
    /*Crear Libro por el autor*/
    public void crearLibro(String nombre){
        //creamos un nuevo libro(clase Libro) con el constructor de Libro
        Libro libro = new Libro(nombre, this);
        //lo añadimos a la lista del autor
        librosAutor.add(libro);
        System.out.println("El libro " + libro.getTitulo() + " ha sido creado por " + this.getNombreAutor() );
    }
    
    
}
