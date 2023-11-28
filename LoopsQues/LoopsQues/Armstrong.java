import java.util.*;
import java.lang.Math;
public class Armstrong {
    public static String armstrong(int n){

        int a=(int)Math.log10(n)+1;
        int sum=0;
        int temp=n;
        while(n>0){
            sum=sum+(int)Math.pow((n%10),a);
            n/=10;
        }
        if(sum==temp)
        return "Armstrong no";
        else
        return "NOT ARMSTRONG";
    }
    public static void main(String[] args) {
        System.out.println("ENTER ANY NUMBER");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(armstrong(n));
    }}