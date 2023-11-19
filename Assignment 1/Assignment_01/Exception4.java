package Assignment_01;
import java.io.File; 
import java.io.FileNotFoundException; 
import java.io.FileReader; 
public class Exception4 {
    public static void main(String args[])  { 
        try {
            File file = new File("E://file.ppt");
            FileReader fr = new FileReader(file); 
        }
        catch (FileNotFoundException e) { 
           System.out.println("File Not Found"); 
        } 
    } 
}
