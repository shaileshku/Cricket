package application.everestengineering.match;

import application.everestengineering.bowling.BowlingOptions;
import application.everestengineering.runs.Runs;
import application.everestengineering.teams.Australia11;
import application.everestengineering.teams.India11;

import static application.everestengineering.utils.MatchConstants.TOTAL_RUN_SCORED;

public class SuperOver {
    // Live Match constants
    public static final Integer BALLS_IN_OVERS = 6;
    public static final Integer TARGET_RUNS = 20;
    static Runs previousRuns = Runs.ZERO;
    static Integer totalRunsScored = 0;
    static Runs wickets = Runs.WICKET;
    static Integer mTotalWicketsInHand=2;

    public static Integer getTotalWicketsInHand() {
        return mTotalWicketsInHand;
    }

    public static void setTotalWicketsInHand(Integer mTotalWicketsInHand) {
        SuperOver.mTotalWicketsInHand = mTotalWicketsInHand;
    }

    public static void main(String[] args) {
        // Keeping assumption India has won the toss.
        // India is Bowling.
        for (int ballNo = 1; ballNo <= BALLS_IN_OVERS; ballNo++) {
            India11 india11 = new India11();
            BowlingOptions ballBowed = india11.bowling();
            // Australia is Batting.
            Australia11 australia11 = new Australia11();

            // Challenge 3:
            australia11.superOver(ballBowed, TARGET_RUNS, totalRunsScored, ballNo, previousRuns, (runs, totalWicketsInHand) -> {
                previousRuns = runs;
                if (runs.getName().equalsIgnoreCase(Runs.WICKET.getName())) {
                    wickets = runs;
                    mTotalWicketsInHand = totalWicketsInHand;
                } else {
                    totalRunsScored += previousRuns.getId();
                }
                System.out.println(TOTAL_RUN_SCORED + totalRunsScored);
            }
            );
            MatchResult matchResult = new MatchResult();
            boolean isMatchOver = matchResult.isMatchOver(TARGET_RUNS, mTotalWicketsInHand,totalRunsScored, ballNo);
            if (isMatchOver) {
                break;
            }

        }

    }


}
