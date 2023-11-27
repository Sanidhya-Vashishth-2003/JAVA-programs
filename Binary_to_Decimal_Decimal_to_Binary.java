import java.util.Scanner;

public class Binary_to_Decimal_Decimal_to_Binary {
    public static long Decimal__to__Binary(int a) {
        long bin = 0;
        for (int i = 0; a != 0; i++) {
            
        

            bin =+ (a % 2) *(int) Math.pow(10, i);
            a = a / 2;
        }
        return bin;

    }

    public static int Binary__to__Decimal(int a) {
        int dec = 0;
        for (int i = 0; a != 0; i++) {
            if (a % 10 <= 1) {

                dec += (a % 10) * Math.pow(2, i);

                a = a / 10;
            } else {
                System.out.println("Given Number is not a Binary");
                return -1;
            }
        }
        return dec;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int Choice = 0;
        while (Choice != 3) {

            System.out.println("Enter Your Choice:\n1.Binary to Decimal\n2.Decimal to Binary\n3.Exit the Program");
            Choice = sc.nextInt();

            switch (Choice) {

                case 1: {
                    System.out.println("Enter your Binary number");
                    int a = sc.nextInt();
                    System.out.println("Output ="+Binary__to__Decimal(a));
                    break;
                }
                case 2: {
                    System.out.println("Enter your Decimal number");
                    int a = sc.nextInt();
                    System.out.println("Output ="+Decimal__to__Binary(a));
                    break;
                }
                case 3: {
                    System.out.println("Thanks for using us check out us again");
                    break;
                }
                default: {
                    System.out.println("Wrong input Try again");
                    break;
                }

            }
        }
        sc.close();

    }
}