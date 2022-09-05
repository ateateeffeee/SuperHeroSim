import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public abstract class Thug {

    //variables
    private String thugType;
    private BigDecimal health = new BigDecimal("0.00");
    private List<Move> movesList = new ArrayList<>();
    //private int defense;
    //private int strength;
    //private int numOfTimesFought = 0;
    //isAlive
    //level
    //weaponList?

    //constructor
    public Thug(String thugType, BigDecimal health, List<Move> movesList){
        this.thugType = thugType;
        this.health = health;
        this.movesList = movesList;

    }

    public Thug(){};

    //write method that subtracts from health, takes in damage as argument


    public String getThugType() {
        return thugType;
    }

    public BigDecimal getHealth() {
        return health;
    }


    public List<Move> getMovesList() {
        return movesList;
    }

}
