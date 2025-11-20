package app;

import domain.Libro;
import domain.Usuario;
import services.GestionBiblioteca;

public class Main {
    public static void main(String[] args) {
        GestionBiblioteca gestion = new GestionBiblioteca();

        Libro l1 = new Libro("Programación Java", "James Gosling", "001");
        Libro l2 = new Libro("Bases de Datos", "Codd", "002");
        gestion.registrarLibro(l1);
        gestion.registrarLibro(l2);

        Usuario u1 = new Usuario("Ana", "100", 2);
        gestion.registrarUsuario(u1);

        gestion.prestar("100", "001");
        gestion.prestar("100", "002");

        gestion.devolver("100", "001");

        for (String evento : gestion.getHistorial()) {
            System.out.println(evento);
        }
    }
}
