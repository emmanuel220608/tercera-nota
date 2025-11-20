import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] tempMin = new int[5];
        int[] tempMax = new int[5];

        // Leer temperaturas
        System.out.println("Ingrese temperaturas mínimas y máximas de 5 días:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Día " + (i + 1) + " - Mínima: ");
            tempMin[i] = sc.nextInt();

            System.out.print("Día " + (i + 1) + " - Máxima: ");
            tempMax[i] = sc.nextInt();
        }

        System.out.println("\n--- Temperatura media de cada día ---");
        for (int i = 0; i < 5; i++) {
            double media = (tempMin[i] + tempMax[i]) / 2.0;
            System.out.println("Día " + (i + 1) + ": " + media);
        }

        int menorTemp = tempMin[0];
        for (int t : tempMin) {
            if (t < menorTemp) menorTemp = t;
        }

        System.out.println("\n--- Días con menor temperatura mínima (" + menorTemp + ") ---");
        for (int i = 0; i < 5; i++) {
            if (tempMin[i] == menorTemp) {
                System.out.println("Día " + (i + 1));
            }
        }

        System.out.print("\nIngrese una temperatura máxima para buscar: ");
        int buscada = sc.nextInt();

        boolean encontrado = false;
        System.out.println("\nDías con temperatura máxima = " + buscada + ":");
        for (int i = 0; i < 5; i++) {
            if (tempMax[i] == buscada) {
                System.out.println("Día " + (i + 1));
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No existe ningún día con esa temperatura máxima.");
        }
    }
}
