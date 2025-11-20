package domain;

import java.util.ArrayList;
import java.util.List;

public class EspacioRecreacional {
    private String nombre;
    private String tipo;
    private int capacidad;
    private List<String> horariosDisponibles;
    private List<String> horariosOcupados;

    public EspacioRecreacional(String nombre, String tipo, int capacidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.horariosDisponibles = new ArrayList<>();
        this.horariosOcupados = new ArrayList<>();
    }

    public void agregarHorario(String horario) {
        horariosDisponibles.add(horario);
    }

    public boolean reservar(String horario) {
        if(horariosDisponibles.contains(horario) && !horariosOcupados.contains(horario)) {
            horariosOcupados.add(horario);
            return true;
        }
        return false;
    }

    public void cancelar(String horario) {
        horariosOcupados.remove(horario);
    }

    public void mostrarDisponibilidad() {
        for(String h : horariosDisponibles) {
            System.out.println(h + (horariosOcupados.contains(h) ? " (Reservado)" : " (Disponible)"));
        }
    }

    public boolean estaDisponible(String horario) {
        return horariosDisponibles.contains(horario) && !horariosOcupados.contains(horario);
    }

    public String getNombre() {
        return nombre;
    }
}
