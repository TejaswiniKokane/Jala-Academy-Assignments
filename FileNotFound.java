import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFound {
    public static void main(String[] args) {

        try {
            
            BufferedReader reader = new BufferedReader(new FileReader(new File("/invalid/file/location")));
        }
        
        catch (FileNotFoundException e) {
            System.err.println("FileNotFoundException caught!");
            
            e.printStackTrace();
        }
    }
}
