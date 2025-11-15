package app;

import domain.Comida;
import domain.Estudiante;
import services.GestionComedor;

public class Main {
    public static void main(String[] args) {
        GestionComedor gestion = new GestionComedor();

        Comida vegetariana = new Comida("Ensalada", "Vegetariana", 5);
        Comida vegana = new Comida("Tofu", "Vegana", 3);
        Comida estandar = new Comida("Pollo", "Estandar", 10);

        gestion.registrarComida(vegetariana);
        gestion.registrarComida(vegana);
        gestion.registrarComida(estandar);

        Estudiante est = new Estudiante("Carlos", "1020");

        gestion.registrarConsumo(est, vegetariana);
        gestion.registrarConsumo(est, estandar);

        gestion.mostrarDisponibilidad();
        gestion.mostrarConsumos();
    }
}
