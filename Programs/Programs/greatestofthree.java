import java.util.*;

public class greatestofthree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER FRIST NUMBER");
        int a=sc.nextInt();
        System.out.println("ENTER SECOND NUMBER");
        int b=sc.nextInt();
        System.out.println("ENTER THIRD NUMBER");
        int c=sc.nextInt();
        System.out.println((a>b)?((a>c)?a:c):((b>c)?b:c));


    }
    
}
