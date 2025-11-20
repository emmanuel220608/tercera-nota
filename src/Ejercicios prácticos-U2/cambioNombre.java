class Persona {
    String nombre;
}

public class cambioNombre {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nombre = "Pedro";
        cambiarNombre(persona);
        System.out.println("Nombre después de cambiarNombre: " + persona.nombre);  
    }

    public static void cambiarNombre(Persona persona) {
        persona.nombre = "Mariana";
    }
}