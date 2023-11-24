import java.util.Scanner;

public class Zero_One_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of triangle");
        int range = sc.nextInt();
        System.out.println();
        for (int i = 0; i < range; i++) {
            for (int j = 1; j <= i+1; j++) {
                System.out.print((i+j)%2+" ");
            }System.out.println(    );
        }
        sc.close();
}
}