public class Primos {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) { // empezamos desde 2, porque 0 y 1 no son primos
            int divisores = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisores++;
                }
            }

            if (divisores == 2) { // solo 2 divisores → primo
                System.out.println(i);
            }
        }
    }
}