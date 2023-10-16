import java.util.*;

public class oddEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER STARTING VALUE");
        int start=sc.nextInt();
        System.out.println("ENTER ENDING VALUE");
        int end=sc.nextInt();
        System.out.println();
        for(int i=start;i<=end;i++){
            int num=i;
            if(num%2==0){
                System.out.println("EVEN NUMBERS ARE: " + num);
            }
        }
        System.out.println();
        for(int i=start;i<=end;i++){
            int num=i;
            if(num%2!=0){
                System.out.println("ODD NUMBERS ARE: " + num);
            }
        }

    }
    
}
