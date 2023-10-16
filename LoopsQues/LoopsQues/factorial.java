import java.util.*;

public class factorial {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("ENTER ANY NUMBER");
    int num=sc.nextInt();
    int sum=1;
    while(num>0){
        sum  = sum * num;
        num--;
        }
        System.out.println("FACT: "+ sum);
    }
}
