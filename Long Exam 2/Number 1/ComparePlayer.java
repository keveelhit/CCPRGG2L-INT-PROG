
public class ComparePlayer extends Player {
    public static void main(String[] args){
        Player player1 = new Player();
        Player player2 = new Player();
        
        System.out.println("Input Information of Player 1 ");
        player1.readPlayer();
        
        System.out.println(" ");
        
        System.out.println("Input Information of Player 2 ");
        player2.readPlayer();
        
        System.out.println(" ");
        
        if (equals(player1, player2)){
            System.out.println("The two players are the same.");
        } else {
        System.out.println("The two players are different.");
        }
    }
    
    public static boolean equals(Player player1, Player player2){
        return player1.team.equals(player2.team) && player2.jerseyNumber == player1.jerseyNumber;
    }
}

