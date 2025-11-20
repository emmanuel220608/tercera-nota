class ModificadorCadena {

    public static void modificarCadena(String texto) {
        texto = texto + " (modificado)";
        System.out.println("Dentro de modificarCadena → " + texto);
    }
}

public class inmutabilidadCadenas {
    public static void main(String[] args) {

        String mensaje = "Hola mundo";

        System.out.println("Antes de modificar → " + mensaje);

        ModificadorCadena.modificarCadena(mensaje);

        System.out.println("Después de modificar → " + mensaje);
    }
}
