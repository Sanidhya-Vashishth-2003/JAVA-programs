import java.util.*;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER YOUR NUMBER: ");
        int a=sc.nextInt();
        int count=0;
        int dig=a;
        while(dig>0){
            dig/=10;
            count++;
        }
        System.out.println(count + " DIGIT");
    }
    
}
