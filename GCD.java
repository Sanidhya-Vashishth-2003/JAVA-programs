import java.util.Scanner;

public class GCD{
public static int gcd(int a, int b) {
while (((a > 0) && (b > 0))) {
  if ((a > b)) {
    a = (a % b);
  } else {
    b = (b % a);
  }
}
if ((a == 0)) {
  return b;
} else {
  return a;
}
}  
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
System.out.println("Enter First Number");
int a = sc.nextInt();
System.out.println("Enter Second Number");
int b = sc.nextInt();
System.out.println("Greatest Common Divisor b/w "+a+" & "+b+" = "+gcd(a, b));
sc.close();
}
}