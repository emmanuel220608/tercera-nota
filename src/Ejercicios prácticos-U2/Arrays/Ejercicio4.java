import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] vector = new int[10];
        int contador = 0;

        System.out.println("Ingrese números (negativo para terminar):");

        while (contador < 10) {
            int num = sc.nextInt();
            if (num < 0) break;
            vector[contador] = num;
            contador++;
        }

        System.out.println("\nElementos ingresados:");
        for (int i = 0; i < contador; i++) {
            System.out.println(vector[i]);
        }
    }
}
