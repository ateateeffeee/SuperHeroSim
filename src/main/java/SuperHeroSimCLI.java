import java.util.List;

public class SuperHeroSimCLI {



    public static void main(String[] args){

//        UserOutput userOutput = new UserOutput();
//        UserInput userInput = new UserInput();
//
//
//        userOutput.displayHeader();
//        userOutput.displayMainMenu();
//        String option = "";
//        do {
//            option = userInput.getHomeScreenOption();
//        } while (option.equals("invalid input"));
//
//        System.out.println("OUTSIDE OF RUNNING LOOP");
        MainMenu mainMenu = new MainMenu();
        NewCharacterMenu newCharacterMenu = new NewCharacterMenu();
        GameMenu gameMenu = new GameMenu();
        RandomGenerators randomGenerators = new RandomGenerators();

       String mainMenuOption = mainMenu.runMainMenu();

        //new game or load game
       if (mainMenuOption.equals("new game")){
           newCharacterMenu.runNewCharacterMenu();
       } else if (mainMenuOption.equals("load game")){
           //load all progress with ResourceManager.load
           //this will still be here but it will be wrapped in a method
           try{
               PlayerCharacter playerCharacter = (PlayerCharacter) ResourceManager.load("playerCharacter.save");


               //System.out.println(playerCharacter.getPowersList().get(0).getDescription() + " is the loaded power description :)");
           }
           catch (Exception ex){
               System.out.println("Couldn't load save.");
           }
       }
       //Game cycle starts
        //generate thug list
        ThugListGenerator thugGenerator = new ThugListGenerator();
       List<Thug> thugList = thugGenerator.createThugList(50);

       //testing
        //System.out.println("This is the thug's health: " + thugList.get(0).getHealth());




        String gameMenuOption;

        do {
            gameMenuOption = gameMenu.runGameMenu();

            if (gameMenuOption.equals("patrol")) {
                //battle
                //choose 3 to 5 random thugs to fight during patrol
                List<Thug> patrolThugs = randomGenerators.patrolThugs(thugList);
                //chance to not see any crime and something else happens???
                //put that here when the time comes

                //battle class


                System.out.println("TIME TO BATTLE");
                //you find 3-5 thugs out of the thug list you take turns beating em up. pausing after every attack "user input"

                //after patrol (or any other option) run gameMenu again

            }

        } while (!gameMenuOption.equals("exit game"));



    }


}
