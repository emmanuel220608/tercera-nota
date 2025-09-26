public class Potencia {
    public static void main(String[] args) {
        int base = 3;
        int exponente = 4;
        int resultado = 1;

        for (int i = 1; i <= exponente; i++) {
            resultado *= base;
        }

        System.out.println(base + "^" + exponente + " = " + resultado);
    }
}