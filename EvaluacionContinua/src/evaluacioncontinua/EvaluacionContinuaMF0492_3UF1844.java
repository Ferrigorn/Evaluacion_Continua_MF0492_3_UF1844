/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evaluacioncontinua;

/**
 *
 * @author Ferriol Babures
 */
public class EvaluacionContinuaMF0492_3UF1844 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Creamos autores*/
        
        Autor autor1 = new Autor("Brandon Sanderson");
        System.out.println("El autor " + autor1.getNombreAutor() + " ha sido añadido a nuestra Biblioteca");
        Autor autor2 = new Autor("Joe Abercrombie");
        System.out.println("El autor " + autor2.getNombreAutor() + " ha sido añadido a nuestra Biblioteca");
        Autor autor3 = new Autor("Jo Nesbo");
        System.out.println("El autor " + autor3.getNombreAutor() + " ha sido añadido a nuestra Biblioteca");
        System.out.println("----------Creacion de Libros----------");
        
        /*Creamos libros*/
        
        autor1.crearLibro("El archivo de las tormentas");
        autor1.crearLibro("El imperio final");
        autor2.crearLibro("El ultimo argumento de los reyes");
        autor2.crearLibro("Un poco de odio");
        autor3.crearLibro("El Pit-roig");
        autor3.crearLibro("La set");
        System.out.println("---------Mostrar Lista de libros-----------");
       
       
        /*Mostrar lista de los libros creados(Todos)*/
        //Realizamos un bucle for para que recorra la lista completa de libros y por cada elemento de la iteracion nos imprima el titulo, el autor y la disponibilidad
        System.out.println("Estos son los libros de nuestra Biblioteca: ");
        for (Libro libroCreado : Libro.getListaTodosLibros()){
            System.out.println(libroCreado.getTitulo() + " de " + libroCreado.getAutor().getNombreAutor() + " se encuentra disponible --> " + libroCreado.getDisponible());
        }
        System.out.println("----------Mostrar Lista de libros por Autor----------");
        
        /*Mostrar lista de los libros del autor*/
        
        System.out.println("Los libros escritos por " + autor1.getNombreAutor() + " son: ");
        //Realizamos un bucle for para que recorra la lista de libros del autor y por cada elemento de la iteracion nos imprima el titulo
        for (Libro libroPublicado : autor1.getLibrosAutor()){
            System.out.println(libroPublicado.getTitulo());
        }
        System.out.println("--------------------");
        
        System.out.println("Los libros escritos por " + autor2.getNombreAutor() + " son: ");
        for (Libro libroPublicado : autor2.getLibrosAutor()){
            System.out.println(libroPublicado.getTitulo());
        }
        System.out.println("--------------------");
        
        System.out.println("Los libros escritos por " + autor3.getNombreAutor() + " son: ");
        for (Libro libroPublicado : autor3.getLibrosAutor()){
            System.out.println(libroPublicado.getTitulo());
        }
        System.out.println("----------Creación de Usuarios----------");
        
        
        
        /*Creación de Usuarios y Miembros Premium*/
        
        Usuario usuario1 = new Usuario("Ferriol Baburés Morente");
        System.out.println("El usuario " + usuario1.getNombreUsuario() + " ha sido añadido a nuestro Sistema");
        MiembroPremium usuarioPremium1 = new MiembroPremium("Tura Baburés Rigola");
        System.out.println("El usuario " + usuarioPremium1.getNombreUsuario() + " ha sido añadido a nuestro Sistema");
        MiembroPremium usuarioPremium2 = new MiembroPremium("Pepito Palotes");
        System.out.println("El usuario " + usuarioPremium2.getNombreUsuario() + " ha sido añadido a nuestro Sistema");
        System.out.println("----------Préstamos----------");
        
        /*Préstamo de libro*/
        
        
        usuario1.prestarLibro("El archivo de las tormentas");
        usuario1.prestarLibro("La set");
        System.out.println("La lista de libros prestados de " + usuario1.getNombreUsuario() + " es: ");
        for (Libro libroPrestado : usuario1.getLibrosPrestados()){
            System.out.println("- " + libroPrestado.getTitulo() + " escrito por " + libroPrestado.getAutor().getNombreAutor());
        }
        
        System.out.println("---------Realizar Reserva(disponibilidad = true)-----------");
        usuarioPremium1.reservarLibro("El Pit-roig");
        System.out.println("---------Realizar Reserva(disponibilidad = false)-----------");
        usuarioPremium1.reservarLibro("La set");
        
        System.out.println("---------Búsqueda ineficaz-----------");
        //introducimos un titulo mal para que nos muestre el mensaje de error
        usuarioPremium1.prestarLibro("El archivo las tontas");
        
        System.out.println("---------Mostrar lista prestamos----------");
        System.out.println("La lista de préstamos de " + usuarioPremium1.getNombreUsuario() + " es ");
        for (Libro libroPrestado : usuarioPremium1.getLibrosPrestados()){
            System.out.println("- " + libroPrestado.getTitulo() + " escrito por " + libroPrestado.getAutor().getNombreAutor());
        }
        System.out.println("---------Mostrar lista reservas usuarioPremium----------");
        System.out.println("La lista de Reservas de " + usuarioPremium1.getNombreUsuario() + " es ");
        for (Libro libroReservado : usuarioPremium1.getLibrosReservados()){
            System.out.println("- " + libroReservado.getTitulo() + " escrito por " + libroReservado.getAutor().getNombreAutor());
        }
        System.out.println("---------Mostrar Lista con los cambios de diponibilidad-----------");
        
        System.out.println("Estos son los libros de nuestra Biblioteca: ");
        for (Libro libroCreado : Libro.getListaTodosLibros()){
            System.out.println(libroCreado.getTitulo() + " de " + libroCreado.getAutor().getNombreAutor() + " se encuentra disponible --> " + libroCreado.getDisponible());
        }
        System.out.println("---------Devolución de Libros-----------");
        
        /*Devolucion libro*/
        usuario1.devolverLibro("La set");
        System.out.println("La lista de libros prestados de " + usuario1.getNombreUsuario() + " es: ");
        for (Libro libroPrestado : usuario1.getLibrosPrestados()){
            System.out.println("- " + libroPrestado.getTitulo() + " escrito por " + libroPrestado.getAutor().getNombreAutor());
        }
        
        
        
        System.out.println("---------Mostrar Lista con los cambios de diponibilidad-----------");
        
        System.out.println("Estos son los libros de nuestra Biblioteca: ");
        for (Libro libroCreado : Libro.getListaTodosLibros()){
            System.out.println(libroCreado.getTitulo() + " de " + libroCreado.getAutor().getNombreAutor() + " se encuentra disponible --> " + libroCreado.getDisponible());
        }
        System.out.println("--------------------");
    }
    
}
