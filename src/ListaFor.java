import java.util.Scanner;

public class ListaFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuantas frutas deseas agregar a la lista? ");
        int cantidad = sc.nextInt();
        sc.nextLine(); 

        String[] lista = new String[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa el nombre de la fruta " + (i + 1) + ": ");
            lista[i] = sc.nextLine();
        }

        System.out.println("\n--- LISTADO FINAL ---");
        for (int i = 0; i < cantidad; i++) {
            System.out.println((i + 1) + ". " + lista[i]);
        }

        sc.close();
    }
}