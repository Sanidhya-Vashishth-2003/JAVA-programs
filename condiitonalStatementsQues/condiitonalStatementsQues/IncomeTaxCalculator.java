import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double salary;
    System.out.println("Enter your salary :");
    salary = sc.nextDouble();
    if(salary<500000){
        System.out.println("There's no tax on your salary amount "+salary);

    }else if(salary>=500000 && salary<1000000)
    {
        System.out.println("Tax applied on your salary of "+salary+" is 20% ie:"+((salary/100)*20)+"/");
    }
    else{
        System.out.println("Tax applied on your salary of "+salary+" is 30% ie: "+((salary/100)*30)+"/");
    }
    sc.close();
    }
}
