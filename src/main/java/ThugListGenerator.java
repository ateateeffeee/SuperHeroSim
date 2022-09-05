import java.util.ArrayList;
import java.util.List;

public class ThugListGenerator {

    public List<Thug> createThugList(int numOfThugs){
        List<Thug>thugList = new ArrayList<>();

        for(int i = 0; i < numOfThugs; i++){
            //have num gen that determines what enemy type is made
            //if int = 1, name ="GunMan" with GunManGunMan moves/stats
            //brawler
            //thief
            //
            //have generators for all things
            //random generator class for all this

            //for now only makes GunMen


            Thug thug = new Gunman();

            thugList.add(thug);
        }


        return thugList;

    }
}
