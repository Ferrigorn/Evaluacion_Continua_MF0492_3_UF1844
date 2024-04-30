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
public class MiembroPremium extends Usuario{
    private List<Libro> librosReservados;
    
    public MiembroPremium(String nombre){
        super(nombre);
        this.librosReservados = new ArrayList<>();
    }
    
    /*Métodos*/
    
    /*Get y Set para los atributos*/
    /*Para la lista Libros Reservados*/
    public List<Libro> getLibrosReservados(){
        return librosReservados;
    }
    
    public void setLibrosReservados(List librosReservados){
        this.librosReservados = librosReservados;
    }
    
    public void reservarLibro(String titulo){
        /*creamos una variable booleana, esto lo hacemos por si ningun titulo de 
        nuestra Biblioteca coincide con el titulo que ha introducido el usuario*/
        boolean libroEncontrado = false;
        /*Hacemos un bucle for para recorrer la lista de todos los libros (lista en clase libro)*/
        for (Libro libro : Libro.getListaTodosLibros()){
            //evaluamos si cada elemento de la iteración coincide con el titulo introducido por user
            //si coincide, cambiamos la variable booleana inicial por true
            if (libro.getTitulo().equals(titulo)){
                libroEncontrado = true;
                //Hacemos un condicional anidado para saber si el libro encontrado esta disponible
                if(libro.getDisponible() == true){
                    //Si está disponible lo añadimos a la lista del usuario
                    this.librosPrestados.add(libro);
                    //utilizamos el metodo marcarPrestado (booleano)de clase Libro para que cambie su disponibilidad en la lista general
                    libro.marcarPrestado();
                    System.out.println("El usuario " + this.getNombreUsuario() + " ha adquirido el libro " + libro.getTitulo() + " del autor " + libro.getAutor().getNombreAutor());
                }else {
                    //si el libro no esta disponible lo añadimos a la lista de reservas del usuario
                this.librosReservados.add(libro);
                System.out.println("El libro que intenta coger en préstamo ya está prestado, lo hemos añadido a tu lista de RESERVAS");
            }
            break;//ponemos break para que cuando encuentre el libro deje de hacer el bucle
            }
        }
        //si no ha encontrado ningun libro con el titulo que haya introducido el usuario
        if(libroEncontrado == false){
            System.out.println("No hemos encontrado ningún libro que coincida con su búsqueda");
        }
        
    }
    
}
