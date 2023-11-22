import java.util.Scanner;

public class largestof3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter First value");
        a = sc.nextInt();
        System.out.println("Enter Second value");
        b = sc.nextInt();
        System.out.println("Enter Third value");
        c = sc.nextInt();
        if(a>b&&a>c){
            System.out.println(a+" is the largest number");
        }else if(b>a&&b>c)
        System.out.println(b+" is the largest number");
         else if (c>a && c>b){
            System.out.println(c+" is the largest number");
         }else{
            System.out.println("Given numbers are Equal to each other");
         }
         sc.close();
    }
}
