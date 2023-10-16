import java.util.*;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number : ");
        int n = sc.nextInt();
        int sum = 0;
        while (n!=0){
            int lastDigit = n % 10 ;
            n = n / 10;
            sum += lastDigit;
        }
        System.out.println("Sum is : " + sum);
    }
    
}
