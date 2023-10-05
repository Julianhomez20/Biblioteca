public class Libro {
    /*
     * Atributos
     */
    private String titulo;
    private String autor;
    private int numeroPaginas;

    /*
     * Metodos
     */

    /*
     * Metodo para inicializar atributos
     * @param titulo Titulo del libro
     * @param autor Autor del libro
     * @param numeroPaginas Numero de paginas del libro 
     * 
     * Complejidad Temporal: O(1) Tiempo constante
     */
    public Libro (String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    /*
     * Metodos getter y setter
     * Complejidad Temporal: O(1) Tiempo constante
     * La complejidad aplica para todos 
     */


    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return this.numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    /*
     * Metodo para imprimir los objetos de la lista en formato String 
     * Complejidad Temporal: O(1) Tiempo constante
     */
    public String toString() {
        return "Libro [Título: " + titulo + ", Autor: " + autor + ", Número de Páginas: " + numeroPaginas + "]";
    }
    }


     
