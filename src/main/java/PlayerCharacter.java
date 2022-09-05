import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class PlayerCharacter implements Serializable {
    //variables
    //private String name = "";
    private BigDecimal health = new BigDecimal("0.00");
    private BigDecimal money = new BigDecimal("0.00");
    private int stamina = 0;
    private List<Power> powersList = new ArrayList<>();
    private List<Move> movesList = new ArrayList<>();

    /*
    - new classes for powers AND moves?
    - or have moves and powers separated
     */


    //constructor
    public PlayerCharacter(BigDecimal health, BigDecimal money, int stamina, List<Power> powersList,
        List<Move> movesList){

        //this.name = name;
        this.health = health;
        this.money = money;
        this.stamina = stamina;
        this.powersList = powersList;
        this.movesList = movesList;

    }

    public BigDecimal getHealth() {
        return health;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public int getStamina() {
        return stamina;
    }

    public List<Power> getPowersList() {
        return powersList;
    }

    public List<Move> getMovesList() {
        return movesList;
    }
}
