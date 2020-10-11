public class PaperStrategy implements Strategy {

    String result = "";

    public String compete(Strategy opponentStrategy) {
        return opponentStrategy.getResult(this);
    }

    public String getResult(RockStrategy rockStrategy) {
        result = "Player Won.";
        return result;
    }

    public String getResult(PaperStrategy paperStrategy) {
        result = "Draw.";
        return result;
    }

    public String getResult(ScissorsStrategy scissorsStrategy) {
        result = "Computer Won.";
        return result;
    }

    public String toString() {
        return "Paper";
    }
}
