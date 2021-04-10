
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CheckedUncheckedExample {

    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {

        //here user will pass name of a file from command line args and your program will open it to read
        
        String fname=args[0];           //this line may cause ArrayIndexOutOfBoundsException
        FileReader fr=new FileReader(fname);    //this line may cause FileNotFoundException
        
        Class.forName("abcd");
        
    }
}
