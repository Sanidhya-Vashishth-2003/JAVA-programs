import java.util.Scanner;

public class Function_overloading_palindrome {
    public static boolean IsPalindrome(int a) {
        int i=0, n=a;
        while (n!=0) {
            i=(i*10)+(n%10);
            n=n/10;
            
        }
        if(i==a){
            return(true);
        }else{
            return(false);
        }

    }
     public static boolean IsPalindrome(String s) {
        String b="";
       for (int i = 0; i < s.length(); i++) {
        b+=s.charAt(s.length()-i-1);        
       }
       if(s.equals(b))
       {
        return true;
       }else{
        return false;
       }

    }

    
    public static void main(String[] args) {
    System.out.println("Program to check a number or string is Palindrome or not \nEnter your input choice:\n1.Integer\n2/String");
{
    Scanner sc = new Scanner(System.in);
int choice = sc.nextInt();
if(choice==1){
    System.out.println("Enter your integer value");
    int a = sc.nextInt();
  System.out.println( IsPalindrome(a));

}else if(choice==2)
{
    System.out.println("Enter your string");
    String s =sc.next();
    System.out.println(IsPalindrome(s));
}
else{
    System.out.println("Invalid choice Program Terminated");
}
}
    }
}
  