import java.util.*;

public class ReverseOfANum {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("ENTER ANY NUMBER: ");
    int num=sc.nextInt();
    int n=0;
    int rev=0;
    while(num>0){
        n=num % 10;
        rev=rev*10+n;
        num=num/10;
        }
        System.out.println("REVERSE IS: "+ rev);
    }
}