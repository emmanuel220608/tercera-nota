public class Fibonacci {
    public static void main(String[] args)  {
        long a =0L, b=1L,c;
        for (int i=0;i<51;i++) {
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;

        }
    }
}