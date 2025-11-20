class Intercambio {

    public static void intercambiar(int x, int y) {
        int temp = x;
        x = y;
        y = temp;

        System.out.println("Dentro de intercambiar → x: " + x + ", y: " + y);
    }
}

public class intercambioPrimitivos {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Antes de intercambiar → a: " + a + ", b: " + b);

        Intercambio.intercambiar(a, b);

        System.out.println("Después de intercambiar → a: " + a + ", b: " + b);
    }
}
