import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] equipos = new String[15][2];      
        int[][] resultados = new int[15][2];         

        System.out.println("=== REGISTRO DE LA QUINIELA DE FÚTBOL ===");

        for (int i = 0; i < 15; i++) {
            System.out.println("\nPartido " + (i + 1) + ":");

            System.out.print("  Nombre del Equipo 1: ");
            equipos[i][0] = sc.nextLine();

            System.out.print("  Nombre del Equipo 2: ");
            equipos[i][1] = sc.nextLine();

            System.out.print("  Goles de " + equipos[i][0] + ": ");
            resultados[i][0] = sc.nextInt();

            System.out.print("  Goles de " + equipos[i][1] + ": ");
            resultados[i][1] = sc.nextInt();

            sc.nextLine(); 
        }

        System.out.println("\n=== RESULTADOS FINALES DE LA QUINIELA ===");
        for (int i = 0; i < 15; i++) {
            System.out.println("Partido " + (i + 1) + ": " +
                equipos[i][0] + " " + resultados[i][0] + " - " +
                resultados[i][1] + " " + equipos[i][1]);
        }
    }
}
