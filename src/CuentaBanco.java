public class CuentaBanco {
    public static void main(String[] args) {

        final double SALDO_INICIAL = 1000;
        final double RETIRO_SEMANAL = 200;
        final int SEMANAS = 4;

        double totalRetirado = RETIRO_SEMANAL * SEMANAS;
        double saldoFinal = SALDO_INICIAL - totalRetirado;

        System.out.println("Saldo final al terminar el mes: $" + saldoFinal);
    }
}
