import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class RandomGenerators {

    List<String> names = new ArrayList<>();

    public String generateRandomThugType(){

        String name = "";

        //make list of names
        //make num generator in this class, call method in this method, use that number to correspond to name in list
        //make num generator method take in max num (whatever to control num range)
        //generating random thug name THEN AllThugs class, then Battle

        return name;
    }

    public List<Thug> patrolThugs(List<Thug> thugList){
        List<Thug> patrolThugs = new ArrayList<>();

        //first generate whether the num of thugs is 3,4, or 5
        int randomNum = ThreadLocalRandom.current().nextInt(3, 5 + 1);
        //testing
        //System.out.println("Random int between 3 and 5: " + randomNum);

        //this will control loop iterations (while i < numOfThugs)
        for(int i = 0; i < randomNum; i++){
            //then generate a random number 0 through thugList.length
            int randomThugListIndex = ThreadLocalRandom.current().nextInt(0, thugList.size());

            //put those thugs in the thugGroup variable
            patrolThugs.add(thugList.get(randomThugListIndex));

        }

        return patrolThugs;

    }


}
