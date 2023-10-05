/*
 * Importacion de libreria para uso de listas
 */
import java.util.LinkedList;
/*
 * Clase Bibioteca
 */
public class Biblioteca {
    /*
     * Inicialización de lista vacia para agregar libros
     */
    public LinkedList<Libro> librosDisponibles = new LinkedList<>();

    /*
     * Metodo para registrar los libros 
     * Complejidad Temporal: O(1) Tiempo constante
     * 
     * @param Libro libro El objeto de tipo libro que se registra
     * 
     */

    public void registrarLibro (Libro libro) {
        librosDisponibles.add(libro);
        }

    /*
     * Metodo para buscar un libro
     * Complejidad Temporal: O(N) Tiempo lineal
     * 
     * @param String titulo El titulo del libro que se desea buscar
     * 
     */
    public Libro buscarLibro (String titulo) {
        // El ciclo for-each recorre cada libro en la lista librosDisponibles
        for (Libro libro : librosDisponibles) {
            /*
             * Por medio de una estrcutura if se valida si el libro esta disponible
             * Se llama al metodo getTitulo en el objeto libro que devuelve el titulo de libro actual en la iteración
             * El titulo se vuelve insensible a mayusculas o minusculas
             */
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                // Retorna el libro si se encontro
                return libro;
            }
        }
        return null;  // Retorna null si no encuentra el libro
    }

    /*
     * Metodo para mostrar los libros disponibles
     * Complejidad Temporal: O(1) Tiempo constante
     */
    public LinkedList<Libro> mostrarLibrosDisponibles () {
        return this.librosDisponibles;


    }
}