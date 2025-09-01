public class TiendadeRopa {
    public static void main(String[] args) {
    
        final double DESCUENTO = 0.15;
        final double DESCUENTO_EXTRA = 0.05;
        final double PRECIO_CAMISETA = 25;
        final double PRECIO_PANTALON = 30;

        double camisetaDescuento = PRECIO_CAMISETA * (1 - DESCUENTO);
        double pantalonDescuento = PRECIO_PANTALON * (1 - DESCUENTO);

        double total1 = camisetaDescuento + pantalonDescuento;
        System.out.println("Total con 1 camiseta y 1 pantalón: $" + total1);

        double camisetaConExtra = camisetaDescuento * (1 - DESCUENTO_EXTRA);
        double total2 = camisetaConExtra + camisetaDescuento + pantalonDescuento;
        System.out.println("Total con 2 camisetas y 1 pantalón: $" + total2);
    }
}
