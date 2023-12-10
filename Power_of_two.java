import java.util.Scanner;

public class Power_of_two {
    public static String Is_Power_2(int a) {
        
if(a<=0){
   return (a+" is not a power of two");
}
    int b =a;

        while(a/2!=0){

           if(a%2!=0){
                return (b+" is not a power of two");
           }else {
            
            a=a/2;
        }
        }
        return (b+" is a power of two");
        
    }
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Program to Exit this loop Enter -1\n");
        int a=Integer.MAX_VALUE;
        while(a!=-1){
            System.out.println("Enter Your Number to check its power of 2 or not");
           a = sc.nextInt();
          
         
          
        }System.out.println("Program is Sucessfully Terminated");
    sc.close();
    }
}
