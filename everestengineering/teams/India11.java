package application.everestengineering.teams;
import application.everestengineering.bowling.BowlingOptions;
import application.everestengineering.runs.Runs;
import application.everestengineering.interfaces.MatchComponents;
import application.everestengineering.interfaces.TeamActivity;
import application.everestengineering.utils.CricUtility;

import java.util.List;

public class India11 implements TeamActivity {

    @Override
    public BowlingOptions bowling() {
        // team to ball
        List<BowlingOptions> bowlingOptions = BowlingOptions.getAllBowlingOptionsAvailable();
        CricUtility<BowlingOptions> cricUtility = new  CricUtility<>();
        return cricUtility.getRandomItem(bowlingOptions);


    }

    @Override
    public void batting(BowlingOptions bowlingOptions,int ballNo) {
        // team to Bat
    }

    @Override
    public void superOver(BowlingOptions ballBowled, Integer targetToScored,Integer totalRunScored ,int ballNo, Runs runs, MatchComponents matchComponents) {
     // Super over
    }


}
