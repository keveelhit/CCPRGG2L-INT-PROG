package Laboratory1.Number1;
import java.util.Scanner;
import java.io.File;
//import java.io.*;
import java.io.FileNotFoundException;

public class FileRead {
    public static void main(String[] args) throws FileNotFoundException {
            File inputFile = new File("C:\\Users\\main\\Documents\\NetBeansProjects\\CCPRGG2L\\src\\main\\java\\Laboratory1\\Number1\\data.txt");
            Scanner inFile = new Scanner(inputFile);
            
            try{
                while(inFile.hasNextLine()){
                    System.out.println(inFile.nextLine());
                }
                System.out.println("");
            }
            catch(Exception e) {
                System.out.println("An error has occured" + e.getMessage());
        
            }
        }
     
}
