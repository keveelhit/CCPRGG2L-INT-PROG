package Laboratory1.Number3;

import java.io.*;

public class Number3 {

    public static void main(String[] args)throws IOException, FileNotFoundException {
		
        File inputFile = new File("C:\\Users\\main\\Documents\\NetBeansProjects\\CCPRGG2L\\src\\main\\java\\Laboratory1\\Number3\\dummy.txt");
		
        BufferedReader br = new BufferedReader(new FileReader(inputFile));

	      String text;
        text = null;
        int count, i;
        count = 0;
        i = 0;
		
	      try{
            while(i < 5 && ((text = br.readLine()) != null)){
            	for (int j = 0; j < text.length(); j++) {
                    char c = text.charAt(j);
                        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
        		count++;
        		}
        	}
                i++;
            }
        }
        
        catch(IOException e){
            System.out.println("An error has occured: ");
            System.out.println(e.getMessage());
        }
		
	      System.out.println(count);
                
    }

}
