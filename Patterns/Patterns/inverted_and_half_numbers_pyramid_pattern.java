import java.util.Scanner;

public class inverted_and_half_numbers_pyramid_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of triangle");
        int range = sc.nextInt();
        for (int i = 0; i < range; i++) {
            for (int j = 1; j <= range-i; j++) {
                System.out.print(j+" ");
                
            }System.out.println();
            
        }
        sc.close();
    }
}
