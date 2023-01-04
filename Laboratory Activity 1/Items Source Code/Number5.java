package Laboratory1.Number5;

import java.io.*;
import java.util.Scanner;

public class Number5 {
  public static void main(String[] args) throws IOException, FileNotFoundException {
    
      try (
      Scanner userInput = new Scanner(System.in)) {
      System.out.print("File Name: ");
      String inputFileName = userInput.nextLine();
      System.out.print("File Name: ");
      String outputFileName = userInput.nextLine();


      File inputFile = new File(inputFileName);
      PrintWriter output;
          try (Scanner input = new Scanner(inputFile)) {
              FileWriter outputFile = new FileWriter(outputFileName);
              output = new PrintWriter(outputFile);
              while (input.hasNextLine()) {
                  String line = input.nextLine();
                  String[] words = line.split(" ");
                  for (int i = words.length - 1; i >= 0; i--) {
                      output.print(words[i] + " ");
                  }
                  
                  output.println();
                  
              }   
          }
          
      output.close();
      
    }
  }
}
