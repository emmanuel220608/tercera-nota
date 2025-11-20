class Rectangulo {
    int ancho;
    int alto;
}

class Modificador {

    public static void modificarRectangulo(Rectangulo r) {
        r.ancho = 50;
        r.alto = 30;

        System.out.println("Dentro de modificarRectangulo → ancho: " + r.ancho + ", alto: " + r.alto);
    }
}

public class modificacionRectangulo {
    public static void main(String[] args) {

        Rectangulo rect = new Rectangulo();
        rect.ancho = 10;
        rect.alto = 5;

        System.out.println("Antes de modificar → ancho: " + rect.ancho + ", alto: " + rect.alto);

        Modificador.modificarRectangulo(rect);

        System.out.println("Después de modificar → ancho: " + rect.ancho + ", alto: " + rect.alto);
    }
}
