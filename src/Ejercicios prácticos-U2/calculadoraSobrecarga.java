class Calculadora {

    public int sumar(int a, int b) {
        return a + b;
    }

    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public double sumar(double a, double b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }
}

public class calculadoraSobrecarga {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Suma de 2 enteros: " + calc.sumar(7, 14));
        System.out.println("Suma de 3 enteros: " + calc.sumar(5, 9, 40));
        System.out.println("Suma de 2 doubles: " + calc.sumar(4.5, 10.3));

        System.out.println("Resta de 2 enteros: " + calc.restar(34, 7));
    }
}
