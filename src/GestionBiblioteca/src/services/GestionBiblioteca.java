package services;

import domain.Libro;
import domain.Usuario;
import java.util.ArrayList;
import java.util.List;

public class GestionBiblioteca {
    private List<Libro> libros;
    private List<Usuario> usuarios;
    private List<String> historial;

    public GestionBiblioteca() {
        libros = new ArrayList<>();
        usuarios = new ArrayList<>();
        historial = new ArrayList<>();
    }

    public void registrarLibro(Libro libro) {
        libros.add(libro);
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Libro buscarLibro(String isbn) {
        for (Libro l : libros) {
            if (l.getIsbn().equals(isbn)) return l;
        }
        return null;
    }

    public Usuario buscarUsuario(String id) {
        for (Usuario u : usuarios) {
            if (u.getId().equals(id)) return u;
        }
        return null;
    }

    public boolean prestar(String idUsuario, String isbn) {
        Usuario usuario = buscarUsuario(idUsuario);
        Libro libro = buscarLibro(isbn);

        if (usuario == null || libro == null) return false;

        boolean prestado = usuario.prestarLibro(libro);
        if (prestado) historial.add("Usuario " + idUsuario + " prestó " + libro.getTitulo());

        return prestado;
    }

    public boolean devolver(String idUsuario, String isbn) {
        Usuario usuario = buscarUsuario(idUsuario);
        Libro libro = buscarLibro(isbn);

        if (usuario == null || libro == null) return false;

        boolean devuelto = usuario.devolverLibro(libro);
        if (devuelto) historial.add("Usuario " + idUsuario + " devolvió " + libro.getTitulo());

        return devuelto;
    }

    public List<String> getHistorial() {
        return historial;
    }
}
