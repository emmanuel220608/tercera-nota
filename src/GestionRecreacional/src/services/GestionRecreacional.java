package services;

import domain.EspacioRecreacional;
import domain.Estudiante;

import java.util.ArrayList;
import java.util.List;

public class GestionRecreacional {
    private List<EspacioRecreacional> espacios;
    private List<Estudiante> estudiantes;

    public GestionRecreacional() {
        espacios = new ArrayList<>();
        estudiantes = new ArrayList<>();
    }

    public void registrarEspacio(EspacioRecreacional espacio) {
        espacios.add(espacio);
    }

    public void registrarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public EspacioRecreacional buscarEspacio(String nombre) {
        for(EspacioRecreacional e : espacios) {
            if(e.getNombre().equalsIgnoreCase(nombre)) {
                return e;
            }
        }
        return null;
    }

    public void mostrarEspacios() {
        for(EspacioRecreacional e : espacios) {
            System.out.println(e.getNombre());
        }
    }
}
