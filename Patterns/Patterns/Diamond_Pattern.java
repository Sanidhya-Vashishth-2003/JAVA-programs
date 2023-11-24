import java.util.Scanner;

public class Diamond_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of diamond in even terms");
        int range = sc.nextInt();
        
        {for (int i = 0; i < range/2 ; i++) {
          for (int j = 0; j < (range/2)-i ; j++) {
            System.out.print("  ");
          }for (int j = 0; j < i+1; j++) {
            System.out.print("* ");
          }for (int j = 0; j < i; j++) {
            System.out.print("* ");
          }System.out.println();
        }
        if(range%2!=0){
            
            for (int i = 0; i <range; i++) {
                System.out.print("* ");
            }System.out.println();
        }
        for (int i = 0; i < range/2 ; i++) {
          for (int j = 0; j < i+1; j++) {
            System.out.print("  ");
          }for (int j = 0; j <(range/2)-i; j++) {
            System.out.print("* ");
          }for (int j = 0; j < (range/2)-i-1; j++) {
            System.out.print("* ");
          }System.out.println();
        }
}        

sc.close();
    }
}
