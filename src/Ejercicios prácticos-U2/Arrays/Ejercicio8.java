import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Integer> edades = new ArrayList<>();

        while (true) {
            System.out.print("Ingrese nombre del alumno (* para terminar): ");
            String nombre = sc.nextLine();

            if (nombre.equals("*")) break;

            System.out.print("Ingrese edad: ");
            int edad = sc.nextInt();
            sc.nextLine(); 
        
            nombres.add(nombre);
            edades.add(edad);
        }

        System.out.println("\n--- Alumnos mayores de edad (>=18) ---");
        for (int i = 0; i < nombres.size(); i++) {
            if (edades.get(i) >= 18) {
                System.out.println(nombres.get(i) + " - " + edades.get(i));
            }
        }

        int mayorEdad = 0;
        for (int e : edades) {
            if (e > mayorEdad) mayorEdad = e;
        }

        System.out.println("\n--- Alumnos con mayor edad (" + mayorEdad + ") ---");
        for (int i = 0; i < nombres.size(); i++) {
            if (edades.get(i) == mayorEdad) {
                System.out.println(nombres.get(i) + " - " + edades.get(i));
            }
        }
    }
}
