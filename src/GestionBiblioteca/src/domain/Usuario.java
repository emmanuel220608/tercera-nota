package domain;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String id;
    private List<Libro> librosPrestados;
    private int limite;

    public Usuario(String nombre, String id, int limite) {
        this.nombre = nombre;
        this.id = id;
        this.limite = limite;
        librosPrestados = new ArrayList<>();
    }

    public boolean prestarLibro(Libro libro) {
        if (librosPrestados.size() >= limite) return false;
        if (!libro.prestar()) return false;

        librosPrestados.add(libro);
        return true;
    }

    public boolean devolverLibro(Libro libro) {
        if (!librosPrestados.contains(libro)) return false;

        libro.devolver();
        librosPrestados.remove(libro);
        return true;
    }

    public String getId() {
        return id;
    }

    public List<Libro> getLibrosPrestados() {
        return librosPrestados;
    }
}
