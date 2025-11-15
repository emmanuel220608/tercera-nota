package app;

import domain.EspacioParqueadero;
import domain.Vehiculo;
import services.GestionParqueadero;

public class Main {
    public static void main(String[] args) {
        GestionParqueadero gestion = new GestionParqueadero();

        gestion.agregarEspacio(new EspacioParqueadero(1, "carro"));
        gestion.agregarEspacio(new EspacioParqueadero(2, "moto"));
        gestion.agregarEspacio(new EspacioParqueadero(3, "carro"));

        Vehiculo v1 = new Vehiculo("ABC123", "carro", "Juan");
        Vehiculo v2 = new Vehiculo("XYZ987", "moto", "Adriana");

        gestion.registrarVehiculo(v1);
        gestion.registrarVehiculo(v2);

        gestion.asignarEspacio("ABC123");
        gestion.asignarEspacio("XYZ987");
    }
}
