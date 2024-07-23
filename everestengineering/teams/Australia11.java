package application.everestengineering.teams;

import application.everestengineering.batting.BattingOptions;
import application.everestengineering.batting.BattingStrategy;
import application.everestengineering.bowling.BowlingOptions;
import application.everestengineering.match.Commentary;
import application.everestengineering.match.SuperOver;
import application.everestengineering.runs.RunScored;
import application.everestengineering.runs.Runs;
import application.everestengineering.shots.ShotTimings;
import application.everestengineering.interfaces.MatchComponents;
import application.everestengineering.interfaces.TeamActivity;
import application.everestengineering.utils.CricUtility;
import application.everestengineering.utils.MatchConstants;

import java.util.List;

import static application.everestengineering.utils.MatchConstants.BALL;
import static application.everestengineering.utils.MatchConstants.BOWLED;
import static application.everestengineering.utils.MatchConstants.CHALLENGE_1;
import static application.everestengineering.utils.MatchConstants.CHALLENGE_2;
import static application.everestengineering.utils.MatchConstants.NEW_PALYER_ON_STRIKE;
import static application.everestengineering.utils.MatchConstants.PLAYED;
import static application.everestengineering.utils.MatchConstants.SHOT;
import static application.everestengineering.utils.MatchConstants.SUPER_OVER;

public class Australia11 implements TeamActivity {
    private int mBallNo;
    private Runs run = Runs.WICKET;
    private static String mStriker = Austraila11Team.BROWN.getName();
    private static String mNonStriker = Austraila11Team.JONES.getName();

    @Override
    public BowlingOptions bowling() {
        // team to ball
        return BowlingOptions.PACE;
    }

    @Override
    public void batting(BowlingOptions ballBowled, int ballNo) {
        mBallNo = ballNo;
        // team to Bat
        Result result = battingStrategyToPlayAgainstBall(ballBowled);

        // Challenge 1;
        System.out.println(CHALLENGE_1 + mBallNo + " " + ballBowled + " " + " " + result.shortPlayed + " " + result.shotSelection + " " + (run.getName().equalsIgnoreCase(Runs.WICKET.getName()) ? "1 " + Runs.WICKET.getName().toLowerCase() : run.getName() + MatchConstants.RUNS));


        // Challenge 2:
        getCommentaryStatement(ballBowled, result.shortPlayed(), result.shotSelection(), result.run());

    }

    @Override
    public void superOver(BowlingOptions ballBowled, Integer targetToScored, Integer totalRunScored, int ballNo, Runs previousRunScored, MatchComponents matchComponents) {
        // Assuming there will be no batting order change.
        checkBatsmenOnStrike(previousRunScored, mStriker, mNonStriker);
        Result result = battingStrategyToPlayAgainstBall(ballBowled);
        System.out.println(SUPER_OVER + ballNo + BALL);
        run = getRunScoredInOver(mStriker, ballBowled, result.shortPlayed, result.shotSelection, result.run);
        Integer wicket;
        if (run == Runs.WICKET) {
            wicket = SuperOver.getTotalWicketsInHand();
            wicket--;
            SuperOver.setTotalWicketsInHand(wicket);
        }
        matchComponents.nextBall(run, SuperOver.getTotalWicketsInHand());


    }

    public static String checkBatsmenOnStrike(Runs previousRuns, String striker, String nonStriker) {
        switch (previousRuns) {
            case TWO, FOUR, SIX, ZERO:
                // player1 wil continue to be on strike.
                mStriker = striker;
                mNonStriker = nonStriker;
                break;
            case ONE, THREE, FIVE:
                // player2 wil be on strike.
                mStriker = nonStriker;
                mNonStriker = striker;
                break;
            case WICKET: {
                System.out.println(NEW_PALYER_ON_STRIKE);
                if (SuperOver.getTotalWicketsInHand() == 1) {
                    // fall of 1 wicket
                    // player3  will be on Strike.
                    mStriker = Austraila11Team.MARTIN.getName();
                    mNonStriker = nonStriker;

                }
                break;
            }
            default:
        }
        return mStriker;
    }

    public Result battingStrategyToPlayAgainstBall(BowlingOptions ballBowled) {
        BattingStrategy battingStrategy = new BattingStrategy();
        List<BattingOptions> battingOptions = battingStrategy.getBattingStrategyToPlayAgainstBall(ballBowled);
        CricUtility<BattingOptions> cricUtility = new CricUtility<>();
        // Short Played Against Particular Ball.
        BattingOptions shortPlayed = cricUtility.getRandomItem(battingOptions);
        // Short Selected by a Batsmen.
        ShotTimings shotSelection = shotSelectionByBatsmen();
        RunScored runScored = new RunScored();
        List<Runs> runs = runScored.getRunScoredBasedOnShortTimings(shotSelection);
        // Runs Scored by Batsmen on Selection of Shot.
        CricUtility<Runs> utility = new CricUtility<>();
        Runs run = utility.getRandomItem(runs);
        return new Result(shortPlayed, shotSelection, run);


    }

    public record Result(BattingOptions shortPlayed, ShotTimings shotSelection, Runs run) {}


    public String getCommentaryStatement(BowlingOptions ballBowled, BattingOptions shortPlayed, ShotTimings shortSelection, Runs run) {
        String commentary = "";
        if (shortSelection == ShotTimings.LATE && ballBowled == BowlingOptions.BOUNCER && run == Runs.WICKET) {
            commentary = Commentary.EDGE_TAKEN.getName();
        } else {
            commentary = Commentary.getPossibleCommentaryStatement(run);
        }
        System.out.println(CHALLENGE_2 + mBallNo + " " + ballBowled + " " + " " + shortPlayed + " " + shortSelection + " " + commentary + " " + (run.getName().equalsIgnoreCase(Runs.WICKET.name()) ? "0" + MatchConstants.RUNS : run.getName() + MatchConstants.RUNS));

        return commentary;
    }

       public Runs getRunScoredInOver(String playerName, BowlingOptions ballBowled, BattingOptions shortPlayed, ShotTimings shortSelection, Runs run) {
        String bowlerToBowl = India11Team.SUDHAKAR.getName();
        System.out.println(bowlerToBowl + BOWLED + ballBowled + " ball.");
        System.out.println(playerName + PLAYED + shortSelection + " " + shortPlayed + " " + SHOT);
        String commentary = "";
        if (shortSelection == ShotTimings.LATE && ballBowled == BowlingOptions.BOUNCER && run == Runs.WICKET) {
            commentary = Commentary.EDGE_TAKEN.getName();
        } else {
            commentary = Commentary.getPossibleCommentaryStatement(run);
        }
        System.out.println(commentary + " - " + (run.getName().equalsIgnoreCase(Runs.WICKET.name()) ? "0" + MatchConstants.RUNS : run.getName() + MatchConstants.RUNS));
        return run;

    }

    private ShotTimings shotSelectionByBatsmen() {
        List<ShotTimings> shortTimings = ShotTimings.getAllShortTimings();
        CricUtility<ShotTimings> cricUtility = new CricUtility<>();
        return cricUtility.getRandomItem(shortTimings);
    }
}
