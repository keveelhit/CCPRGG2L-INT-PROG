package Laboratory1.Number2;

import java.io.*;

public class Number2 {

	public static void main(String[] args)throws IOException, FileNotFoundException {
		
    File inputFile = new File("C:\\Users\\main\\Documents\\NetBeansProjects\\CCPRGG2L\\src\\main\\java\\Laboratory1\\Number2\\data.txt");
		BufferedReader br = new BufferedReader(new FileReader(inputFile));

	  int i;
    i = 0;
        
	  try{
            
        String text;
           
        while(i < 5 && ((text = br.readLine()) != null)){
            System.out.println(text);
            i++;
        }
    }
    catch(IOException e){
        System.out.println("An error has occured: ");
        System.out.println(e.getMessage());
    }
        
   }

}
