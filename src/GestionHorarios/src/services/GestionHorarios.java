package services;

import domain.Estudiante;
import domain.Materia;
import java.util.ArrayList;
import java.util.List;

public class GestionHorarios {
    private List<Materia> materias;
    private List<Estudiante> estudiantes;

    public GestionHorarios() {
        materias = new ArrayList<>();
        estudiantes = new ArrayList<>();
    }

    public void registrarMateria(Materia materia) {
        materias.add(materia);
    }

    public void registrarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public Materia buscarMateria(String nombre) {
        for (Materia m : materias) {
            if (m.getNombre().equalsIgnoreCase(nombre)) return m;
        }
        return null;
    }

    public Estudiante buscarEstudiante(String id) {
        for (Estudiante e : estudiantes) {
            if (e.getId().equals(id)) return e;
        }
        return null;
    }

    public boolean inscribir(String idEstudiante, String nombreMateria, String horario) {
        Estudiante e = buscarEstudiante(idEstudiante);
        Materia m = buscarMateria(nombreMateria);
        if (e == null || m == null) return false;
        try {
            return e.inscribirMateria(m, horario);
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
}
