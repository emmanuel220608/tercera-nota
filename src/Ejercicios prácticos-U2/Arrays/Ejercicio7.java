import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vector1 = new int[5];
        int[] vector2 = new int[5];
        int[] vector3 = new int[5];

        System.out.println("Ingrese 5 valores para vector1:");
        for (int i = 0; i < 5; i++) {
            vector1[i] = sc.nextInt();
        }

        System.out.println("Ingrese 5 valores para vector2:");
        for (int i = 0; i < 5; i++) {
            vector2[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            vector3[i] = vector1[i] + vector2[i];
        }

        System.out.println("vector3 (suma de ambos):");
        for (int i = 0; i < 5; i++) {
            System.out.println(vector3[i]);
        }
    }
}
