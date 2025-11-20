import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] notas = new double[5];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + " (0-10): ");
            notas[i] = sc.nextDouble();
        }

        System.out.println("\nNotas ingresadas:");
        for (double n : notas) {
            System.out.println(n);
        }

        double suma = 0;
        double mayor = notas[0];
        double menor = notas[0];

        for (double n : notas) {
            suma += n;
            if (n > mayor) mayor = n;
            if (n < menor) menor = n;
        }

        double media = suma / notas.length;

        System.out.println("\nNota media: " + media);
        System.out.println("Nota más alta: " + mayor);
        System.out.println("Nota más baja: " + menor);
    }
}
