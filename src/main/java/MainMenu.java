public class MainMenu {

    public String runMainMenu(){
        UserOutput userOutput = new UserOutput();
        UserInput userInput = new UserInput();


        userOutput.displayHeader();
        userOutput.displayMainMenu();
        String option = "";
        do {
            option = userInput.getHomeScreenOption();
        } while (option.equals("invalid input"));

        return option;

    }
}
