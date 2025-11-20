package domain;

public class EspacioParqueadero {
    private int numero;
    private String tipoPermitido;
    private boolean ocupado;
    private Vehiculo vehiculo;

    public EspacioParqueadero(int numero, String tipoPermitido) {
        this.numero = numero;
        this.tipoPermitido = tipoPermitido;
        this.ocupado = false;
        this.vehiculo = null;
    }

    public boolean estaDisponible() {
        return !ocupado;
    }

    public boolean asignarVehiculo(Vehiculo vehiculo) {
        if (!estaDisponible()) return false;
        if (!vehiculo.getTipo().equalsIgnoreCase(tipoPermitido)) return false;

        this.vehiculo = vehiculo;
        this.ocupado = true;
        return true;
    }

    public void liberarEspacio() {
        vehiculo = null;
        ocupado = false;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipoPermitido() {
        return tipoPermitido;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
}
