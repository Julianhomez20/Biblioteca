import java.util.LinkedList;
import java.util.Scanner;
/*
 * Clase Principal
 */
public class Principal {
    /*
     * Metodo inicial que es ejecutado
     * @param args
     * 
     * Complejidad temporal: Las complejidades en esta clase se asignan en los diferentes caso del switch
     */
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca bibliotecaKonradLorenz = new Biblioteca();

        /*
         * Objetos de la clase Libro
         * Cinco libros predefinidos en la biblioteca
         */

        Libro cienAñosDeSoledad = new Libro("Cien anios de soledad", "Gabriel Garcia Marquez", 496);
        Libro elCodigoDaVinci = new Libro("El codigo Da Vinci", "Dan Brown", 656);
        Libro milNovecientosochentaycuatro = new Libro("1984", "George Orwell", 326);
        Libro elHobbit = new Libro("El Hobbit", "J.R.R. TOLKIEN", 310);
        Libro laOdisea = new Libro("La odisea", "Homero", 448);

        //Registrar libros predefinidos en la biblioteca
        bibliotecaKonradLorenz.registrarLibro(cienAñosDeSoledad);
        bibliotecaKonradLorenz.registrarLibro(elCodigoDaVinci);
        bibliotecaKonradLorenz.registrarLibro(milNovecientosochentaycuatro);
        bibliotecaKonradLorenz.registrarLibro(elHobbit);
        bibliotecaKonradLorenz.registrarLibro(laOdisea);


        /*
         * Menu biblioteca
         */
        System.out.println("Escoja una opción del menu\n1. Registrar nuevo libro\n2. Buscar libro\n3. Ver libros disponibles");
        int opcion = sc.nextInt();

        switch(opcion) {
            /*
             * Opción #1 del menu
             * Complejidad Temporal : O(N) Tiempo Lineal
             */
            case 1:
                System.out.println("Ingrese el nombre del libro");
                sc.nextLine();
                String nombreLibro = sc.nextLine();
                System.out.println("Ingrese el autor del libro");
                String autorLibro = sc.nextLine();
                System.out.println("Ingrese la cantidad de paginas del libro");
                int paginasLibro = sc.nextInt();
                System.out.println();
                
                /*
                * Objeto del nuevo libro para la clase Libro
                */
                Libro nuevoLibro = new Libro(nombreLibro, autorLibro, paginasLibro);
                bibliotecaKonradLorenz.registrarLibro(nuevoLibro);
                /*
                 * Con el ciclo for imprimimos la lista actualizada con el nuevo libro
                 */
                for (Libro libro : bibliotecaKonradLorenz.librosDisponibles) {
                    System.out.println("Titulo: " + libro.getTitulo());
                    System.out.println("Autor: " + libro.getAutor());
                    System.out.println("Numero de paginas: " + libro.getNumeroPaginas());
                    System.out.println();
                }
                break;
            /*
             * Opción #2 del menu
             * Complejidad Temporal:  O(N) Tiempo lineal
             */
            case 2:
                System.out.println("Ingrese el nombre del libro a buscar");
                sc.nextLine();
                String nombreLibroB = sc.nextLine().toLowerCase();
                Libro libroEncontrado  = bibliotecaKonradLorenz.buscarLibro(nombreLibroB);

                if (libroEncontrado != null) {
                    System.out.println("Libro disponible !!!");
                    System.out.println();
                    System.out.println("Titulo: " + libroEncontrado.getTitulo());
                    System.out.println("Nombre del autor: " + libroEncontrado.getAutor());
                    System.out.println("Numero de paginas: " + libroEncontrado.getNumeroPaginas());
                } else  {
                    System.out.println("Libro no encontrado");

                }
                break;
            /*
             * Opción #3 del menu
             * Complejidad Temporal: O(N) Tiempo lienal
             */
            case 3:
                LinkedList<Libro> librosDisponibles = bibliotecaKonradLorenz.mostrarLibrosDisponibles();
                for (Libro libro : librosDisponibles) {
                    System.out.println("Título: " + libro.getTitulo());
                    System.out.println("Autor: " + libro.getAutor());
                    System.out.println("Número de Páginas: " + libro.getNumeroPaginas());
                    System.out.println(); // Imprimir linea para separar libros
                }
                break;
            default:
                System.out.println("Igrese una opcion valida");
                


        }


        
    

       

    }
    
   
}

