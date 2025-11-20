package services;

import domain.Comida;
import domain.Estudiante;

import java.util.ArrayList;
import java.util.List;

public class GestionComedor {
    private List<Comida> comidas;
    private List<String> registroConsumo;

    public GestionComedor() {
        comidas = new ArrayList<>();
        registroConsumo = new ArrayList<>();
    }

    public void registrarComida(Comida comida) {
        comidas.add(comida);
    }

    public void mostrarDisponibilidad() {
        for(Comida c : comidas) {
            System.out.println(c.getNombre() + " - " + c.getTipo() + " - Disponibles: " + c.getDisponibilidad());
        }
    }

    public boolean registrarConsumo(Estudiante estudiante, Comida comida) {
        boolean servido = comida.servir();
        if(servido) {
            registroConsumo.add(estudiante.getNombre() + " consumió " + comida.getNombre());
            return true;
        }
        return false;
    }

    public void mostrarConsumos() {
        for(String r : registroConsumo) {
            System.out.println(r);
        }
    }

    public Comida buscarComida(String nombre) {
        for(Comida c : comidas) {
            if(c.getNombre().equalsIgnoreCase(nombre)) {
                return c;
            }
        }
        return null;
    }
}
