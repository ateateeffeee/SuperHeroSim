import java.util.ArrayList;
import java.util.List;

public class Battle {

    //variables
    private PlayerCharacter playerCharacter;
    private List<Thug> thugGroup = new ArrayList<>();
    //create thug class
    //create AllThugs class
    //thugGroup is taken from all thugs
    //loop through list to break it up

    UserOutput userOutput = new UserOutput();
    UserInput userInput = new UserInput();


    //constructor
    public Battle (PlayerCharacter playerCharacter, List<Thug> thugGroup){
        this.playerCharacter = playerCharacter;
        this.thugGroup = thugGroup;
    }


}
