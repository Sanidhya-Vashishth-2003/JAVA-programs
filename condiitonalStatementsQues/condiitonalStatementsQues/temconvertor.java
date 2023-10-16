import java.util.*;
public class temconvertor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Temperature Converter");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Enter your choice (1/2): ");
        
        int choice = sc.nextInt();
        double temperature;

        if (choice == 1) {
            System.out.print("Enter temperature in Fahrenheit: ");
            temperature = sc.nextDouble();
            double celsius = fahrenheitToCelsius(temperature);
            System.out.println("Result: " + temperature + "°F = " + celsius + "°C");
        } else if (choice == 2) {
            System.out.print("Enter temperature in Celsius: ");
            temperature = sc.nextDouble();
            double fahrenheit = celsiusToFahrenheit(temperature);
            System.out.println("Result: " + temperature + "°C = " + fahrenheit + "°F");
        } else {
            System.out.println("Invalid choice. Please select 1 or 2.");
        }

        sc.close();
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32.0) * 5.0/9.0;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0/5.0) + 32.0;
    }
}