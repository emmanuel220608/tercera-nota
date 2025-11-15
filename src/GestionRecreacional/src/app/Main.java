package app;

import domain.EspacioRecreacional;
import domain.Estudiante;
import services.GestionRecreacional;

public class Main {
    public static void main(String[] args) {
        GestionRecreacional gestion = new GestionRecreacional();

        EspacioRecreacional cancha = new EspacioRecreacional("Cancha Futbol", "Cancha", 10);
        cancha.agregarHorario("8:00");
        cancha.agregarHorario("10:00");
        cancha.agregarHorario("14:00");

        gestion.registrarEspacio(cancha);

        Estudiante est = new Estudiante("Ana", "001");
        gestion.registrarEstudiante(est);

        est.reservarEspacio(cancha, "10:00");
        cancha.mostrarDisponibilidad();

        est.cancelarReserva(cancha, "10:00");
        cancha.mostrarDisponibilidad();
    }
}
