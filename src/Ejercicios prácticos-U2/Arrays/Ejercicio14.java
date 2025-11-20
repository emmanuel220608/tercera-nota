import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] precios = new double[5];
        int[][] cantidades = new int[4][5]; 

        System.out.println("Introduce los precios de los 5 artículos:");
        for (int i = 0; i < precios.length; i++) {
            System.out.print("Precio del artículo " + (i + 1) + ": ");
            precios[i] = sc.nextDouble();
        }

        System.out.println("\nIntroduce las cantidades vendidas por cada sucursal:");
        for (int s = 0; s < 4; s++) {
            System.out.println("Sucursal " + (s + 1) + ":");
            for (int a = 0; a < 5; a++) {
                System.out.print("Artículo " + (a + 1) + ": ");
                cantidades[s][a] = sc.nextInt();
            }
        }

        int[] totalArticulos = new int[5];
        for (int a = 0; a < 5; a++) {
            for (int s = 0; s < 4; s++) {
                totalArticulos[a] += cantidades[s][a];
            }
        }

        int totalSucursal2 = 0;
        for (int a = 0; a < 5; a++) {
            totalSucursal2 += cantidades[1][a];
        }

        int art3_suc1 = cantidades[0][2];

        double[] recaudacionSucursal = new double[4];
        for (int s = 0; s < 4; s++) {
            for (int a = 0; a < 5; a++) {
                recaudacionSucursal[s] += cantidades[s][a] * precios[a];
            }
        }

        double recaudacionTotal = 0;
        for (double r : recaudacionSucursal) {
            recaudacionTotal += r;
        }

        int indiceMayor = 0;
        for (int s = 1; s < 4; s++) {
            if (recaudacionSucursal[s] > recaudacionSucursal[indiceMayor]) {
                indiceMayor = s;
            }
        }

        System.out.println("\n--- RESULTADOS ---");

        System.out.println("\n1. Cantidades totales por artículo:");
        for (int a = 0; a < 5; a++) {
            System.out.println("Artículo " + (a + 1) + ": " + totalArticulos[a]);
        }

        System.out.println("\n2. Cantidad de artículos en la sucursal 2: " + totalSucursal2);

        System.out.println("\n3. Cantidad del artículo 3 en la sucursal 1: " + art3_suc1);

        System.out.println("\n4. Recaudación por sucursal:");
        for (int s = 0; s < 4; s++) {
            System.out.println("Sucursal " + (s + 1) + ": $" + recaudacionSucursal[s]);
        }

        System.out.println("\n5. Recaudación total de la empresa: $" + recaudacionTotal);

        System.out.println("\n6. Sucursal con mayor recaudación: Sucursal " + (indiceMayor + 1));
    }
}
