public class FinallyExample {
    public static void main(String[] args) {
        System.out.println("Start-of-Main..............!!");
        int x = 0, y = 0, z = 0;
        try {
            System.out.println("Starting Try....!");
            x = Integer.parseInt(args[0]);
            y = Integer.parseInt(args[1]);
            z = x / y;
            System.out.println("Ending Try....!");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Starting Catch.....!");
            System.out.println("Invalid Inputs.....!");
            System.out.println("Ending Catch.....!");
        }finally{
            System.out.println("Inside Finally --- Always Run ---- !!!..");
        }
        System.out.println("Result : " + z);
        System.out.println("End-of-Main................!!");
    }
}
