import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class NewCharacterMenu {

    public void runNewCharacterMenu(){
        UserOutput userOutput = new UserOutput();
        UserInput userInput = new UserInput();



        userOutput.displayEnterSuperHeroNamePrompt();
        //System.out.println(userInput.getSuperHeroName());
        userInput.getSuperHeroName();

        //creating default character for now
        List<Power> powersList = new ArrayList<>();
        powersList.add(new SuperStrength());

        List<Move> movesList = new ArrayList<>();
        //makes classes for each move
        //this would just be "movesList.add(new Choke slam)"
        movesList.add(new Move("Choke slam", "Pick em up and slam em down", new BigDecimal("50"), new BigDecimal(".25"),2));

        PlayerCharacter playerCharacter = new PlayerCharacter(new BigDecimal("150"),
                new BigDecimal("0.00"), 20, powersList,movesList);



        //test save. maybe move to a "gameMenu" option to save it all at once
        try {
            ResourceManager.save(playerCharacter, "playerCharacter.save");
            System.out.println("SAVED");
        }
        catch (Exception ex){
            System.out.println("Could not save data.");
        }


        //test object and access
//        System.out.println("You just used " + playerCharacter.getMovesList().get(0).getName() + "!" + " You killed him!");
//        System.out.println("oh yeah and your power is " + playerCharacter.getPowersList().get(0).getName());
        //System.out.println(playerCharacter);
        //will be better to make moves and powers interfaces and then classes for each specific power/move

    }
}
