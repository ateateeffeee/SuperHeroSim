import java.io.Serializable;

public abstract class Power implements Serializable {

    //variables
    private String name = "";
    private String description = "";


    public Power(String name, String description){
        this.name = name;
        this.description = description;

    }
//    public Power(){};

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
