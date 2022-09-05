import java.util.Locale;
import java.util.Scanner;

public class UserInput {

    private Scanner scanner = new Scanner(System.in);

    public String getHomeScreenOption(){
        String option = scanner.nextLine().trim().toLowerCase();

        if(option.equals("n")){
            return "new game";
        } else if (option.equals("l")){
            return "load game";
        } else {
            return "invalid input";
        }
    }

    public String getSuperHeroName(){

        return scanner.nextLine();
    }

    public String getGameMenuOption(){
        String option = scanner.nextLine().trim().toLowerCase();

        if(option.equals("p")){
            return "patrol";
        } else if(option.equals("e")){
            return "exit game";
        } else {
            return "invalid input";
        }
    }

    public String getEnterInput(){
        String option = scanner.nextLine();

        return "continue";

    }
}
