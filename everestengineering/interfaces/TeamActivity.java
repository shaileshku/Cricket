package application.everestengineering.interfaces;

import application.everestengineering.bowling.BowlingOptions;
import application.everestengineering.runs.Runs;

public interface TeamActivity {
    BowlingOptions bowling();
    void batting(BowlingOptions bowlingOptions,int ballNo);
    void superOver(BowlingOptions ballBowled, Integer targetToScored, Integer totalRunScored ,int ballNo, Runs runs, MatchComponents matchComponents);
}
