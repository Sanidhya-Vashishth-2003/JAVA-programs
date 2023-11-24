import java.util.Scanner;

public class Multiplication_Table {
    public static void Table(int N) {
        for (int i = 1; i <= 30 ; i++) {
            System.out.println(N+"*"+i+" = "+(N*i));
        }
        
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int N;
        N=sc.nextInt();
        Table(N);
        sc.close();
    }
}
