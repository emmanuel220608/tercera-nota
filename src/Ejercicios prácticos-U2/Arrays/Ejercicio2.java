import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] original = new String[5];
        String[] invertido = new String[5];

        System.out.println("Ingrese 5 palabras:");
        for (int i = 0; i < original.length; i++) {
            original[i] = sc.nextLine();
        }

        for (int i = 0; i < original.length; i++) {
            invertido[i] = original[original.length - 1 - i];
        }

        System.out.println("Vector invertido:");
        for (String s : invertido) {
            System.out.println(s);
        }
    }
}
