public class RockStrategy implements Strategy {

    String result = "";

    public String compete(Strategy opponentStrategy) {
        return opponentStrategy.getResult(this);
    }

    public String getResult(RockStrategy rockStrategy) {
        result = "Draw.";
        return result;
    }

    public String getResult(PaperStrategy paperStrategy) {
        result = "Computer Won.";
        return result;
    }

    public String getResult(ScissorsStrategy scissorsStrategy) {
        result = "Player Won.";
        return result;
    }

    public String toString() {
        return "Rock";
    }
}
