import java.util.Random;

public class StrategyGenerator {

    public static final Random random = new Random();

    public static Strategy generate(){
        int n = random.nextInt(3);
        String s = "";
        if(n == 0){
            s = "r";
        }
        else if(n == 1){
            s = "p";
        }
        else{
            s = "s";
        }
        return getStrategy(s);
    }
    public static Strategy getStrategy(String st) {
        if(st.equals("r")){
            return new RockStrategy();
        }
        else if (st.equals("p")){
            return new PaperStrategy();
        }
        else {
            return new ScissorsStrategy();
        }
    }
}