package ejerciciosunidad1;
import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bandera = 1;
        while (bandera==1){
            System.out.println("Operaciones:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.print("Ingrese el numero de la operacion que quiere realizar:");
            int operacion = scanner.nextInt();
            System.out.print("Ingrese cuantos numeros desea utilizar:");
            int number = scanner.nextInt();
            int result = 0;
            switch (operacion){
                case 1: 
                for (int i = 1; i<=number; i++){
                    System.out.print("Escriba numero " + i + ":");
                    int number1 = scanner.nextInt();
                    result = result + number1; 
                }
                System.out.println("El resultado de la suma es:" + result);
                break;

                case 2: 
                for (int i = 1; i<=number; i++){
                    System.out.print("Escriba numero " + i + ":");
                    int number1 = scanner.nextInt();
                     if (i==1){
                        result = number1;
                    }else {
                        result = result - number1; 
                    }

                }
                System.out.println("El resultado de la resta es:" + result);
                break;

                case 3: 
                for (int i = 1; i<=number; i++){
                    System.out.print("Escriba numero " + i + ":");
                    int number1 = scanner.nextInt();
                    if(i==1){
                        result = number1;
                    }else {
                    result = result * number1;}
                }
                System.out.println("El resultado de la multiplicacion es:" + result);
                break;

                case 4: 
                for (int i = 1; i<=number; i++){
                    System.out.print("Escriba numero " + i + ":");
                    int number1 = scanner.nextInt();
                     if(i==1){
                        result = number1;
                    }else {
                    result = result/number1; }
                }
                System.out.println("El resultado de la division es:" + result);
                break;
            }
            System.out.print("Escribir 1 para otra hacer otra operacion u otro valor para finalizar:");
            bandera = scanner.nextInt();
        }
        scanner.close();
    }
    
}
