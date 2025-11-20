class Incremento {

    public static int incrementar(int x) {
        x = x + 1;
        System.out.println("Dentro de incrementar → x: " + x);
        return x;
    }
}

public class incrementoPrimitivo {
    public static void main(String[] args) {

        int x = 10;

        System.out.println("Antes de incrementar → x: " + x);

        // Llamada sin usar el valor retornado
        Incremento.incrementar(x);
        System.out.println("Después de llamar sin asignar → x: " + x);

        // Llamada usando el valor retornado
        x = Incremento.incrementar(x);
        System.out.println("Después de asignar el valor retornado → x: " + x);
    }
}

