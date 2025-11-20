public class numeroMayor {

    public static int mayor(int a, int b, int c) {
        int max = a;

        if (b > max) max = b;
        if (c > max) max = c;

        return max;
    }

    public static void main(String[] args) {
        System.out.println(mayor(5, 12, 9));    
        System.out.println(mayor(-3, -8, -1));  
        System.out.println(mayor(100, 50, 100));
    }
}
