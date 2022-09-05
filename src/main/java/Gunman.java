import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Gunman extends Thug {

    //variables
    private static String thugType = "Gunman";
    private static BigDecimal health = new BigDecimal("100");
    //List<Move> movesList = new ArrayList<Move>(new Move());
    private static List<Move> movesList = new ArrayList<>();

    public Gunman(){
        super(thugType, health, movesList);

    }


}
