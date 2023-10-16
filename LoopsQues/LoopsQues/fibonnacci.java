import java.util.*;

public class fibonnacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER");
        int dig=sc.nextInt();
        int a=0;
       int b=1;
        System.out.println(a);
        System.out.println(b);
        for(int i=1;i<=dig;i++){
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}