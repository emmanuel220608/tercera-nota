package domain;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String nombre;
    private String id;
    private List<String> materiasInscritas;
    private List<String> horariosInscritos;

    public Estudiante(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        materiasInscritas = new ArrayList<>();
        horariosInscritos = new ArrayList<>();
    }

    public boolean inscribirMateria(Materia materia, String horario) {
        if (horariosInscritos.contains(horario)) {
            throw new RuntimeException("El horario ya está ocupado");
        }
        if (!materia.getHorarios().contains(horario)) {
            throw new RuntimeException("Horario no disponible para esta materia");
        }
        materiasInscritas.add(materia.getNombre() + " - " + horario);
        horariosInscritos.add(horario);
        return true;
    }

    public void mostrarHorarioCompleto() {
        for (String m : materiasInscritas) {
            System.out.println(m);
        }
    }

    public String getId() {
        return id;
    }
}
