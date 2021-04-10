
import java.util.Scanner;

public class ThrowExampleTwo {
    public static void main(String args[]){
        int up=0,qty=0,total=0;
        
        System.out.println("Billing Application .....! ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Unit Price : ");
        up=sc.nextInt();
        try{
            if(up<0){
                InvalidPriceException ob=new InvalidPriceException();
                throw ob;
            }
        }catch(InvalidPriceException e){
            System.out.println("Price Cant Be Less Than 0..!");
            System.out.println("Minimum Price 100 Taken....!");
            up=100;
        }
        System.out.println("Enter Quantity Purchased : ");
        qty=sc.nextInt();
        total=up*qty;
        System.out.println("Bill Amount : "+total);
    }
}
//here we want price should be always more than 0, if someone passes price less then 0 
//it should be considered as InvalidPriceException

