package domain;

public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean prestado;

    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.prestado = false;
    }

    public boolean prestar() {
        if (prestado) return false;
        prestado = true;
        return true;
    }

    public void devolver() {
        prestado = false;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }
}
