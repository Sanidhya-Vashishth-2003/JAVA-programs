import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter side of square");
       int side = sc.nextInt();
       side*=side;
       System.out.println("Area of Square is "+side);
       sc.close();
    }
}
