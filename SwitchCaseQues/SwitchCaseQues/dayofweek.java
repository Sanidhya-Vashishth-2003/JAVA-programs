import java.util.Scanner;

public class dayofweek {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER YOUR CHOICE(1-7)");
        int choice=sc.nextInt();
        switch(choice){
            case 1:{
                if(choice%7==0){
            System.out.println("SUNDAY");
            System.out.println("WEEKEND");
            break;}}
            case 2:{
                if(choice%7==1){
                System.out.println("MONDAY");
                System.out.println("WEEKDAY");
                break;}
            }
            case 3:{
                if(choice%7==2){
                System.out.println("TUESDAY");
                System.out.println("WEEK DAY");
                break;}}
            case 4:{
                if(choice%7==3){
                System.out.println("WEDNESDAY");
                System.out.println("WEEK DAY");
                break;}}
                case 5:{
                    if(choice%7==4){
                    System.out.println("THURSDAY");
                    System.out.println("WEEKDAY");
                    break;}}
                case 6:{
                    if(choice%7==5){
                    System.out.println("FRIDAY");
                    System.out.println("WEEKEND");
                    break;}}
                case 7:{
                    if(choice%7==6){
                    System.out.println("SATURDAY");
                    System.out.println("WEEKEND");
                }}
        }
    }
    
}