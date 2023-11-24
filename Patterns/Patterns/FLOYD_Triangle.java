import java.util.Scanner;

public class FLOYD_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of triangle");
        int a=1,range = sc.nextInt();
        for (int i = 0; i < range; i++) {
            for (int j = 0; j < i+1 ; j++) {
                System.out.print(a+" ");
                a++;
            }System.out.println();
        }
        
        sc.close();
    }
    
}
