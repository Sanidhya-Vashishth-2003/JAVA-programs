import java.util.Scanner;

public class bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil,pen,eraser;
        System.out.println("Enter price of Pencil");
        pencil=sc.nextFloat();
        System.out.println("Enter price of Pen");
        pen=sc.nextFloat();
        System.out.println("Enter price of Eraser");
        eraser=sc.nextFloat();
        System.out.println("Price of the Pencil ="+pencil);
        System.out.println("Price of the Pencil ="+pen);
        System.out.println("Price of the Pencil ="+eraser);
        System.out.println("Total Amount = "+(pen+pencil+eraser)+" + 18% Gst");
        pen =(pen+pencil+eraser)+(((pen+pencil+eraser)/100)*18);
        System.out.println("Total payable amount = "+pen);


        sc.close();
    }
}
