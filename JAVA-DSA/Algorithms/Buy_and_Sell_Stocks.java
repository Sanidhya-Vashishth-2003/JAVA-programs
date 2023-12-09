import java.util.Scanner;

public class Buy_and_Sell_Stocks {
    
    public static void Stock_Profit_Loss(int [] arr) {
        int Buyprice=Integer.MAX_VALUE,sp=0;
        System.out.println("Stock price at each  day");
        BarChart.Bar_chart(arr.clone());//using previous code to make barchart
        System.out.println("\n\n");
        int profit=0;
        
        for (int i = 0; i < arr.length; i++) {
           
            profit =Buyprice<arr[i]?Math.max(profit,arr[i]-Buyprice)==profit?profit:arr[i]-Buyprice:profit;
            Buyprice = Buyprice>arr[i]?arr[i]:Buyprice;
           sp=Math.max(sp, arr[i]);
            
        }
        System.out.println("Maximum Profit =:  "+profit+"\nBest Buying Price for maximum profit=: "+(sp-profit)+"\nBest Selling Price for maximum profit=: "+(sp));
        
    }
    public static void main(String[] args) {
        System.out.println("Enter total days");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int[] arr =new int[day];
        for ( int i = 0; i < arr.length; i++) {
           System.out.print( "Enter "+(i+1)+" day Stock price : ");
           arr[i]=sc.nextInt();
           System.out.println();
            
        }
        Stock_Profit_Loss(arr);
        sc.close();
    }
}
