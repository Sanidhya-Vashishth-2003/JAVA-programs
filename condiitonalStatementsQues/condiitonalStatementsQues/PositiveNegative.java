import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter your number");
        a= sc.nextInt();
        if(a>=0){System.out.println(a+" is a Positive Number");}
        else{System.out.println(a+" is a Negative Number");} 
        sc.close();
    }
}
