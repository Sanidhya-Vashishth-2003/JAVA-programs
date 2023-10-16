import java.util.*;

public class discountcal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE AMOUNT OF PURCHASE");
        int pur=sc.nextInt();
        int dis=0;
        if(pur<5000 && pur>=1000){
            dis=(pur*5)/100;
            System.out.println("YOUR DISCOUNT IS RUPEES : " + dis);
            System.out.println("YOUR BILL IS RUPEES : " + (pur-dis));
        }
        else if(pur<10000&&pur>5000){
            dis=(pur*10)/100;
            System.out.println("YOUR DSICOUNT IS RUPEES : " + dis);
            System.out.println("YOUR BILL IS RUPEES : " + (pur-dis));
        }
        else if(pur<20000&&pur>10000){
            dis=(pur*15)/100;
            System.out.println("YOUR DSICOUNT IS RUPEES: " + dis);
            System.out.println("YOUR BILL IS : " + (pur-dis));
        }
        else{
            dis=(pur*25)/100;
            System.out.println("YOUR DSICOUNT IS RUPEES: " + dis);
            System.out.println("YOUR BILL IS RUPEES: " + (pur-dis));
        }

    }
    
}
