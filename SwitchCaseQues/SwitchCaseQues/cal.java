import java.util.Scanner;

public class cal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER");
        int a=sc.nextInt();
        System.out.println("ENTER THE SECOND NUMBER");
        int b=sc.nextInt();
        System.out.println("ENTER YOUR CHOICE");
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. *");
        System.out.println("4. /");
        char choice=sc.next().charAt(0);
        switch(choice){
            case '+':
            {
            System.out.println("THE ADDITION IS: " + (a+b));
            break;}
            case '-':
            {
            System.out.println("THE SUBTRACTION IS: " + (a-b));
            break;}
            case '*':
            {
            System.out.println("THE MULTIPLICATION IS: " + (a*b));
            break;}
            case '/':
            if(b==0){
                System.out.println("DIVISION IS NOT POSSIBLE");
            }
            else
            System.out.println("THE DIVISION IS: " + (a/b));
        }
    }   
}
