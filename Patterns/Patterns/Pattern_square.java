import java.util.Scanner;

public class Pattern_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range");
        int range=sc.nextInt();
        for (int i = 0; i < range; i++) {
            for (int j = 0; j < range; j++) {
                System.out.print("* ");
            }
            System.out.println();
            
        }
        sc.close();;
    }
}
