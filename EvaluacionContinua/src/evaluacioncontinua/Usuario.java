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
public class Usuario {
    private String nombre;
    protected List<Libro> librosPrestados;
    
    /*Constructor*/
    public Usuario(String nombre){
        this.nombre = nombre;
        this.librosPrestados = new ArrayList<>();
    }
    
    /*Métodos*/
    
    /*Get y Set para los atributos*/
    
    /*Para el nombre*/
    public String getNombreUsuario(){
        return nombre;
    }
    
    public void setNombreUsuario(String nombre){
        this.nombre = nombre;
    }
    
    /*Para la lista de prestados*/
    public List<Libro> getLibrosPrestados(){
        return librosPrestados;
    } 
    
    public void setLibrosPrestados(List librosPrestados){
        this.librosPrestados = librosPrestados;
    }
    
    /*Para tomar prestado*/ //Añade el libro a la lista de libros prestados y cambia su disponibilidad(de true a false) debe tener un for para recorrer la lista de todos los libros, dentro un if para obtener el titulo 
    public void prestarLibro(String titulo){
        /*creamos una variable booleana, esto lo hacemos por si ningun titulo de 
        nuestra Biblioteca coincide con el titulo que ha introducido el usuario*/
        boolean libroEncontrado = false;
        /*Hacemos un bucle for para recorrer la lista de todos los libros (lista en clase libro)*/
        for (Libro libro: Libro.getListaTodosLibros()){
            //evaluamos si cada elemento de la iteración coincide con el titulo introducido por user
            //si coincide, cambiamos la variable booleana inicial por true
            if(libro.getTitulo().equals(titulo)){
                libroEncontrado = true;
                //Hacemos un condicional anidado para saber si el libro encontrado esta disponible
                if(libro.getDisponible() == true){
                    //Si está disponible lo añadimos a la lista del usuario
                    this.librosPrestados.add(libro);
                    //utilizamos el metodo marcarPrestado (booleano)de clase Libro para que cambie su disponibilidad en la lista general
                    libro.marcarPrestado();
                    System.out.println("El usuario " + this.getNombreUsuario() + " ha adquirido el libro " + libro.getTitulo() + " del autor " + libro.getAutor().getNombreAutor());
                }else {
                System.out.println("El libro que intenta coger en préstamo ya está prestado");
                }
                break;//ponemos break para que cuando encuentre el libro deje de hacer el bucle
            }
        }
        if(libroEncontrado == false){
            System.out.println("El libro " + titulo + " no se encuentra en nuestra biblioteca");
        }
    } 
    /*Para devolver Libro Prestado*/ 
    
    //Tiene la misma estructura que prestarLibro, solo que aquí buscamos el libro en la lista del usuario
    public void devolverLibro(String titulo){
        boolean libroEncontrado = false;
        for (Libro libro : this.getLibrosPrestados()){
            if(libro.getTitulo().equals(titulo)){
                libroEncontrado = true;
                if(libro.getDisponible() == false){//miramos si la disponibilidad está en false(quiere decir que alguien lo tiene,en principio el usuario mismo
                    //otra diferencia, cambiamos el .add por .remove
                    this.librosPrestados.remove(libro);
                    libro.marcarDevuelto();
                    System.out.println("El usuario " + this.getNombreUsuario() + " ha devuelto el libro " + libro.getTitulo() + " del autor " + libro.getAutor().getNombreAutor());
                }else {
                    System.out.println("El libro que intenta devolver en préstamo no se encuentra en su posesión");
                }
                break;
            }
        }
        if(libroEncontrado == false){
            System.out.println("El libro que intenta devolver no se encuentra en su lista de Libros Prestados");
        }
    }
    
    
}
