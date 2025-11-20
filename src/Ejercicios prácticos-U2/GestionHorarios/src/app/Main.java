package app;

import domain.Materia;
import domain.Estudiante;
import services.GestionHorarios;

public class Main {
    public static void main(String[] args) {
        GestionHorarios gestion = new GestionHorarios();

        Materia m1 = new Materia("Programación", "PROG101", 3);
        m1.agregarHorario("Lunes 8-10");
        m1.agregarHorario("Miércoles 10-12");

        Materia m2 = new Materia("Matemáticas", "MAT201", 4);
        m2.agregarHorario("Lunes 8-10");
        m2.agregarHorario("Viernes 14-16");

        gestion.registrarMateria(m1);
        gestion.registrarMateria(m2);

        Estudiante e1 = new Estudiante("Carlos", "001");
        gestion.registrarEstudiante(e1);

        gestion.inscribir("001", "Programación", "Lunes 8-10");
        gestion.inscribir("001", "Matemáticas", "Viernes 14-16");

        e1.mostrarHorarioCompleto();
    }
}
