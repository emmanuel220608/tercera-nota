import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] meses = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        int[] dias = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        System.out.print("Ingrese un número de mes (1-12): ");
        int num = sc.nextInt();

        if (num < 1 || num > 12) {
            System.out.println("Número de mes inválido.");
        } else {
            System.out.println("Mes: " + meses[num - 1]);
            System.out.println("Días: " + dias[num - 1]);
        }
    }
}
