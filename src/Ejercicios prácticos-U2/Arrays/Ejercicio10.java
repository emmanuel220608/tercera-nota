import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[5][5];

        System.out.println("Ingrese los valores de la matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n--- Suma de filas ---");
        for (int i = 0; i < 5; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 5; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println("Fila " + (i + 1) + ": " + sumaFila);
        }

        System.out.println("\n--- Suma de columnas ---");
        for (int j = 0; j < 5; j++) {
            int sumaCol = 0;
            for (int i = 0; i < 5; i++) {
                sumaCol += matriz[i][j];
            }
            System.out.println("Columna " + (j + 1) + ": " + sumaCol);
        }
    }
}
