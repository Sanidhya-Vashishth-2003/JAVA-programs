import java.util.Scanner;
import java.lang.Math;
public class ReverseNumber {
    public static void main(String[] args) {
        int num,mun=0,i;
   
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your number");
        num=sc.nextInt();
         i=  (int)Math.pow(10, (int)Math.log10(num));
         
        while(num!=0)
        {
            mun+=(num%10)*i;
            num/=10;
            i/=10;
             
        }System.out.println(mun+" "+num);
        sc.close();
    }
}
