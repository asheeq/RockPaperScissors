import java.util.*;

public class RockPaperScissors {
    private static Strategy playerStrategy;
    private static Strategy computerStrategy;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Boolean wantsToPlay = true;
        while(wantsToPlay){
            System.out.println("Enter 'r' for Rock, 'p' for Paper, 's' for Scissors or 'q' to Quit playing.");
            String input = sc.nextLine();
            if(input.equals("q")){
                wantsToPlay = false;
                break;
            }
            else if(input.equals("r") || input.equals("p") || input.equals("s")){
                playerStrategy = StrategyGenerator.getStrategy(input);
                computerStrategy = StrategyGenerator.generate();
                System.out.println("Player: "+playerStrategy);
                System.out.println("Computer: "+computerStrategy);
                System.out.println(computerStrategy.compete(playerStrategy));

            }
            else {
                System.out.println("Invalid Input.");
            }
        }
        sc.close();
    }
}
