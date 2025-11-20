import java.util.Arrays;
import java.util.Random;

public class Ejercicio5 {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }

        System.out.println("Vector original:");
        System.out.println(Arrays.toString(numeros));

        Arrays.sort(numeros);

        System.out.println("Vector ordenado:");
        System.out.println(Arrays.toString(numeros));
    }
}
