public class PromedioArreglo {
    public static void main(String[] args) {
        int[] numeros = {5, 8, 12, 3, 9, 15, 7, 2, 10, 6};

        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        double promedio = (double) suma / numeros.length;

        System.out.println("La suma es: " + suma);
        System.out.println("El promedio es: " + promedio);
    }
}

