/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacioncontinua;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ferriol Baburés
 */
public class Libro {
    private String titulo;
    private Autor autor;
    private boolean disponible;
    private static List<Libro> listaTodosLibros = new ArrayList<>();
    
    public Libro(String titulo, Autor autor){
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
        listaTodosLibros.add(this);
    }
    
    /*Métodos*/
    
    /*Get y Set para todos los atributos*/
    /*Para el titulo*/
    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    /*Para el autor*/
    public Autor getAutor(){
        return autor;
    }
    
    public void setAutor(Autor autor){
        this.autor = autor;
    }
    
    /*Para la disponibilidad*/
    public boolean getDisponible(){
        return disponible;
    }
    
    public void setDisponibilidad(boolean disponible){
        this.disponible = disponible;
    }
    
    /*Para la lista de todos los libros*/
    public static List<Libro> getListaTodosLibros(){
        return listaTodosLibros;
    }
    
    public static void setListaTodosLibros(List listaTodosLibros){
        Libro.listaTodosLibros = listaTodosLibros;
    }
    
    /*Marcar Prestado*/
    public  boolean marcarPrestado(){//Cambiamos la disponibilidad que está por defecto en true a false
        this.disponible = false;
        System.out.println("El libro " + this.titulo + " ha sido prestado");
        return disponible;
    }
    
    /*Marcar devuelto*/
    public boolean marcarDevuelto(){//Cambiamos la disponibilidad que está en false(porque está prestado) a true
        this.disponible = true;
        System.out.println("El libro " + this.titulo + " ha sido devuelto");
        return disponible;
    }
    
}
