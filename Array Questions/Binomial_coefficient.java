
import java.util.Scanner;

public class Binomial_coefficient {
    public static long Binomial__coefficient(int n,int r) {
        long a = Factorial(n);
        long b = Factorial(r);
        long c = Factorial(n-r);
        return(a/(b*c));

    }

    public static long Factorial(int a) {
        long b = 1;
        for (int i = a; i > 1; i--) {
            b *= i;
        }
        return b;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n= sc.nextInt();
        System.out.println("Enter value of r");
        int r = sc.nextInt();
        System.out.println(Binomial__coefficient(n,r));
        sc.close();
    }
}
