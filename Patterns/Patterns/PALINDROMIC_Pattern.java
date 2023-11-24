import java.util.Scanner;

public class PALINDROMIC_Pattern {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter length of Pyramid");
       int range = sc.nextInt();
       for (int i = 0; i < range; i++) {
        for (int j = 0; j < range-i; j++) {
            System.out.print("  ");
        }for (int j = i+1; j>0; j--) {
            System.out.print(j+" ");
        }for (int j =2; j < 2+i; j++) {
            System.out.print(j+" ");
            
        }System.out.println();
       }
       sc.close();
    }
    
}
