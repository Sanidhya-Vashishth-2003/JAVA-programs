import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to check it prime or not");
        int num = sc.nextInt();
        boolean flag=false;
        
        for (int i = 2; i <= (num/2); i++) {
            if(i!=num){
            if(num%i==0){
                System.out.println(num+" is a composite number");
                flag=true;
                break;
            }}
            
        }
        if (flag==false){
            System.out.println(num+" is a Prime Number");
        }
        sc.close();
    }
}
