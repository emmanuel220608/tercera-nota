import java.util.Random;

public class Ejercicio1 {
    public static void main(String[] args) {

        int[] vector_numeros = new int[10];
        Random random = new Random();

        for (int i = 0; i < vector_numeros.length; i++) {
            vector_numeros[i] = random.nextInt(10) + 1; // 1 a 10
        }

        for (int num : vector_numeros) {
            System.out.println("Número: " + num + 
                               " | Cuadrado: " + (num * num) + 
                               " | Cubo: " + (num * num * num));
        }
    }
}
