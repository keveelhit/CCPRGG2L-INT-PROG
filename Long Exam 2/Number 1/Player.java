
import java.util.Scanner;

public class Player {
    
    public String name;
    public String team;
    public int jerseyNumber;
    
    public void readPlayer(){
        Scanner input = new Scanner(System.in);
        System.out.print("Name: ");
        name = input.nextLine();
        System.out.print("Team: ");
        team = input.nextLine();
        System.out.print("Jersey Number: ");
        jerseyNumber = input.nextInt();
       
    }
}
