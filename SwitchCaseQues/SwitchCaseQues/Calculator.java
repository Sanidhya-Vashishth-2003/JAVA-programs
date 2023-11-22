import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a,b;
        System.out.println("Enter value of A");
        a= sc.nextFloat();
        System.out.println("Enter value of B");
        b= sc.nextFloat();
        System.out.println("Type\n1. for Addition\n\n2. for Substraction\n\n3. for Multiplication\n\n4. for Division\n\n5. for Modulo\n\n");
        int choice = sc.nextInt();
        System.out.println("\n\n\n");
switch (choice) {

    case 1:
        {
System.out.println("A+B ="+(a+b));
break;
        }
       
 case 2:
       { 
        System.out.println("A-B ="+(a-b));
break;
}
case 3:
       { 
        System.out.println("A*B ="+(a*b));
break;
}
case 4:
       { 
        System.out.println("A/B ="+(a/b));
break;
}
case 5:
       { 
        System.out.println("A%B ="+(a%b));
break;
}
    default:
      {  break;}
}

        sc.close();
    }
}
