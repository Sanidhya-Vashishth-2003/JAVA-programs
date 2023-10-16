import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER INITIAL AMOUNT");
        int a=sc.nextInt();
        System.out.println("1. CREDIT");
        System.out.println("2. DEBIT");
        System.out.println("3. CHECK BALANCE");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
            {
                System.out.println("ENTER CREDIT AMOUNT");
                int b=sc.nextInt();
                a=a+b;
                System.out.println("NEW BALANCE: " + a);
                break;
            }
            case 2:
            {
                System.out.println("ENTER DEBIT AMOUNT");
                int c=sc.nextInt();
                if(c>a){
                    System.out.println("YOU HAVE INSUFFICIENT BALANCE");
                    break;
                }
                else{
                     a=a-c;
                System.out.println("NEW BALANCE: " + a);
                break;
                }
            }
            case 3:
            {
              System.out.println("YOUR BALANCE IS: " + a);
              break;
            }
        }
    }
}
