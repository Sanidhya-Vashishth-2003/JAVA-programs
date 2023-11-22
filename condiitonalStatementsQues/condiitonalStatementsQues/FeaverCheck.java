import java.util.Scanner;
public class FeaverCheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float temp;
        System.out.println("Enter your body temperature");
        temp = sc.nextFloat();
        if(temp>=100){System.out.println("You have feaver please consult doctor or take medicine");}
        else{System.out.println("You are safe no need to take any medicine just take a rest if you feel uneasy");}
        sc.close();
    }
}