package domain;

import java.util.ArrayList;
import java.util.List;

public class Materia {
    private String nombre;
    private String codigo;
    private int creditos;
    private List<String> horarios;

    public Materia(String nombre, String codigo, int creditos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
        this.horarios = new ArrayList<>();
    }

    public void agregarHorario(String horario) {
        horarios.add(horario);
    }

    public List<String> getHorarios() {
        return horarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarHorariosDisponibles() {
        for (String h : horarios) {
            System.out.println(h);
        }
    }
}
