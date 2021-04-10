
import java.util.Scanner;


public class ThrowExample {

    public static void main(String[] args) {

        int x=0,y=0,r=0;
        System.out.println("Start-of-Main..............!!");
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter First Number : ");
        x=sc.nextInt();
        System.out.println("Enter Second Number : ");
        y=sc.nextInt();
        
        try
        {
            if(y>x){
                //here we are going to throw ArithmeticException
                ArithmeticException ob=new ArithmeticException();
                throw ob;
            }
            
            r=x/y;
        }catch(ArithmeticException e){
            System.out.println("Handling ArithmeticException...!");
            r=x/2;
        }
        
        System.out.println("Result  : "+r);
        
        
        System.out.println("End-of-Main................!!");
    
        
        
        
    }
}
