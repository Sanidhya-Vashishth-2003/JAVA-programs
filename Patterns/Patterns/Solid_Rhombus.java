import java.util.Scanner;

public class Solid_Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of Rhombus");
        int range  = sc.nextInt();

        for (int i = 0; i <range; i++) {
            for (int j = 0; j < range-i; j++) {
                System.out.print("  ");
            }for (int j = 0; j < range; j++) {
                System.out.print(" *");
            }System.out.println();
            
        }
        sc.close();

    }
}
