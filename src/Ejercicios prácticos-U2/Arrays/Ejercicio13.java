import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numConductores = 3; 
        String[] nombres = new String[numConductores];
        int[][] kms = new int[numConductores][7]; 
        int[] total_kms = new int[numConductores];

        for (int i = 0; i < numConductores; i++) {
            System.out.print("Nombre del conductor " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();

            System.out.println("Introduce los kms de los 7 días:");
            for (int d = 0; d < 7; d++) {
                System.out.print("Día " + (d + 1) + ": ");
                kms[i][d] = sc.nextInt();
                total_kms[i] += kms[i][d];
            }
            sc.nextLine(); 
        }

        System.out.println("\n--- TOTAL DE KILÓMETROS POR CONDUCTOR ---");
        for (int i = 0; i < numConductores; i++) {
            System.out.println(nombres[i] + ": " + total_kms[i] + " kms");
        }
    }
}
