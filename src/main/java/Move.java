import java.io.Serializable;
import java.math.BigDecimal;

public class Move implements Serializable {

    //variables
    String name = "";
    String description = "";
    BigDecimal damage = new BigDecimal("0.00");
    BigDecimal criticalChance = new BigDecimal("0.00");
    int usageCost = 0;



    //constructor
    public Move(String name, String description, BigDecimal damage, BigDecimal criticalChance, int usageCost){
        this.name = name;
        this.description = description;
        this.damage = damage;
        this.criticalChance = criticalChance;
        this.usageCost = usageCost;

    }
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getDamage() {
        return damage;
    }

    public BigDecimal getCriticalChance() {
        return criticalChance;
    }

    public int getUsageCost() {
        return usageCost;
    }


}
