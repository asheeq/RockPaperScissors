public interface Strategy {

    String compete(Strategy opponentStrategy);
    String getResult(RockStrategy rockStrategy);
    String getResult(PaperStrategy paperStrategy);
    String getResult(ScissorsStrategy scissorsStrategy);
}
