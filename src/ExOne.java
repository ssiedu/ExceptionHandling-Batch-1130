
public class ExOne {

    public static void main(String[] args) {
        System.out.println("Start-of-Main..............!!");
        int x = 0, y = 0, z = 0;
        try {
            x = Integer.parseInt(args[0]);
            y = Integer.parseInt(args[1]);
            z = x / y;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Insufficient Values....!");
        }catch(NumberFormatException e){
            System.out.println("Invalid Numbers....!");
        }catch(ArithmeticException e){
            z=x/2;
        }catch(Exception e){
            System.out.println("Unknown Problem....!");
        }
        System.out.println("Result : " + z);
        System.out.println("End-of-Main................!!");
    }
}
