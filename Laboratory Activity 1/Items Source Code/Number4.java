package Laboratory1.Number4;

import java.io.*;
import java.util.Scanner;

public class Number4 {
  public static void main(String[] args) throws IOException, FileNotFoundException {
    
		Scanner input = new Scanner(System.in);
    String fileName, x; int wordCount;
                
		System.out.print("File name: ");
		fileName = input.next();
		String filePath = "C:\\Users\\main\\Documents\\NetBeansProjects\\CCPRGG2L\\src\\main\\java\\Laboratory1\\Number4\\" + fileName + ".txt"; 
		
    String[] words = null;
		wordCount = 0;
		File inputFile = new File(filePath); 
		FileReader fr = new FileReader(inputFile);
		BufferedReader br = new BufferedReader(fr);
		
		try {
			while((x = br.readLine())!= null) {
			words = x.split(" ");
			wordCount = wordCount + words.length;
		}
                        
		fr.close();
		System.out.println("Word Count: "+wordCount);
                
		}
		catch(IOException e) {
			System.out.println("An error has occured: "+e.getMessage());
		}
	
	}

}
