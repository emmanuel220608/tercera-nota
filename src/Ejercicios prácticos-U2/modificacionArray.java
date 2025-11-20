class ModificadorArray {

    public static void modificarArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2; // Ejemplo: duplicar cada valor
        }

        System.out.print("Dentro de modificarArray → ");
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

public class modificacionArray {
    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 5};

        System.out.print("Antes de modificar → ");
        for (int n : numeros) {
            System.out.print(n + " ");
        }
        System.out.println();

        ModificadorArray.modificarArray(numeros);

        System.out.print("Después de modificar → ");
        for (int n : numeros) {
            System.out.print(n + " ");
        }
    }
}
