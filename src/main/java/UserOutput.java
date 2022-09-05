public class UserOutput {

    public void displayHeader(){
        System.out.println("********************");
        System.out.println("*                  *");
        System.out.println("*  SUPER HERO SIM  *");
        System.out.println("*                  *");
        System.out.println("********************");
    }

    public void displayMainMenu(){
        System.out.println("(N)ew Game");
        System.out.println("(L)oad Game");
    }

    public void displayCharacterCreator(){
        //have to do one prompt at a time
        //then wrap them in create char class
        //what all would you need to enter?
        //name?

    }

    public void displayEnterSuperHeroNamePrompt(){
        System.out.println("Enter your super hero name: ");

    }

    public void displayGameMenu(){
        //this will pull in playerCharacter to display your stats/info
        System.out.println("***********************");
        System.out.println("*What do you wanna do?*");
        System.out.println("***********************");
        System.out.println("\n(P)atrol");
        System.out.println("something cool");
        System.out.println("something cool");
        System.out.println("(E)xit Game");
        //System.out.println("(U)pgrade character");
    }

    public void displayPressSpacePrompt(){
        System.out.println("Press spacebar to continue...");
    }

    public void battleIntroPrompt(){
        System.out.println("You've spotted some thugs!");
        System.out.println("Mess em up!");
    }

    public void battleMenu(){
        System.out.println("(A)ttack");
        //items
        //talk?
        //flee

        //make it so a thug can take a hostage?
    }
}
