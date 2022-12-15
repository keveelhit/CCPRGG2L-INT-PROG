import java.io.*;
//import java.io.File;
//import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        File file = new File("input.txt");
        
        try{
            if (!file.exists()) {
              // creates file
              file.createNewFile();
              // create a file
              System.out.println(file.getName() + " successfully created.");
              // create file path
              System.out.println(file.getAbsolutePath());
            }
            else {
                // checks if the file exist
                System.out.println(file.getName() + " already exists.");
                System.out.println(file.getAbsolutePath());
                // checks the length of the file
                System.out.println(file.length());
                // deletes the file after checking
                file.delete();
                // notify the user that the file is deleted
                System.out.println("File already deleted.");
            }
        } 
        catch(IOException e){
            System.out.println("There is an error: ");
            System.out.println(e.getMessage());
     
        }
    }
 
}
