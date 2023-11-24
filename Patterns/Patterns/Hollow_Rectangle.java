import java.util.Scanner;

public class Hollow_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of rectangle");
        int Range =sc.nextInt();
        for (int i = 0; i <Range; i++) {
            for (int j = 0; j < Range+2; j++) {
                if(i==0||j==0||i==Range-1||j==Range+1){
                System.out.print("* ");
            }else System.out.print("  ");
                
            }System.out.println();
            
        }
        sc.close();
    }
    
}
