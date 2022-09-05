public class GameMenu {

    public String runGameMenu(){
        UserOutput userOutput = new UserOutput();
        UserInput userInput = new UserInput();

        userOutput.displayGameMenu();

        String option = "";
        do {
            option = userInput.getGameMenuOption();
        } while (option.equals("invalid input"));

        return option;
    }
}
