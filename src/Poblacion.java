public class Poblacion {
    public static void main(String[] args) {
        int poblacion = 1000;
        double tasaCrecimiento = 0.02; // 2%
        int anios = 10;

        for (int i = 1; i <= anios; i++) {
            poblacion += (int)(poblacion * tasaCrecimiento);
            System.out.println("Año " + i + ": " + poblacion + " habitantes");
        }
    }
}
