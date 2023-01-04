package Laboratory1.Number1;

import java.io.*;

public class Number1 {
    public static void main(String[] args) throws IOException, FileNotFoundException{

        int sum;
        sum = 0;
        
        try (BufferedReader data = new BufferedReader(new FileReader("data.txt"))) {
            String text;
            
            while ((text = data.readLine()) != null) {
             
                System.out.println(text);
                sum += Integer.parseInt(text);

            }
        } catch (IOException e) {
        
            System.out.println("An error has occured: " + e.getMessage());
        }
    
        try (PrintWriter pw = new PrintWriter(new FileWriter("sum.txt"))) {
       
            pw.println(sum);
            System.out.println("The file of sum is succesfully created.");
            
        } catch (IOException e) {
            System.out.println("An error has occured: " + e.getMessage());
        }
    }
}
