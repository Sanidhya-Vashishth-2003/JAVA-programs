import java.util.Scanner;

public class largestof2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value");
        int a=sc.nextInt();
         System.out.println("Enter Secont value");
        int b=sc.nextInt();
        
        if(a>b){System.out.println(a+" is largest number");}
        else if(b<a){System.out.println(b+" is the largest number");}
        else{System.out.println("Both numbers are equal");}
        sc.close();
    }
}
