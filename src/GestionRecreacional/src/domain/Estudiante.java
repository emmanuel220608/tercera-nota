package domain;

public class Estudiante {
    private String nombre;
    private String id;

    public Estudiante(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public boolean reservarEspacio(EspacioRecreacional espacio, String horario) {
        return espacio.reservar(horario);
    }

    public void cancelarReserva(EspacioRecreacional espacio, String horario) {
        espacio.cancelar(horario);
    }

    public String getNombre() {
        return nombre;
    }
}
