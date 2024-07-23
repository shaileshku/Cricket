package application.everestengineering.tests;

import application.everestengineering.batting.BattingOptions;
import application.everestengineering.bowling.BowlingOptions;
import application.everestengineering.match.Commentary;
import application.everestengineering.match.MatchResult;
import application.everestengineering.match.SuperOver;
import application.everestengineering.runs.Runs;
import application.everestengineering.shots.ShotTimings;
import application.everestengineering.teams.Austraila11Team;
import application.everestengineering.teams.Australia11;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class TestCricketLogics {

    @Test
    public void checkBatsmenOnStrike(){
        assertEquals(Austraila11Team.JONES.getName(),Australia11.checkBatsmenOnStrike(Runs.THREE,Austraila11Team.BROWN.getName(),Austraila11Team.JONES.getName()));
        assertEquals(Austraila11Team.BROWN.getName(),Australia11.checkBatsmenOnStrike(Runs.TWO,Austraila11Team.BROWN.getName(),Austraila11Team.JONES.getName()));

    }

    @Test
    public void isMatchLost(){
        // Australia lost by 8 Runs
        MatchResult matchResult = new MatchResult();
        boolean isMatchOver = matchResult.isMatchOver(SuperOver.TARGET_RUNS, SuperOver.getTotalWicketsInHand(),12, SuperOver.BALLS_IN_OVERS);
        assertTrue(isMatchOver);
    }

    @Test
    public void isWonByWickets(){
        // Australia won by 2 wickets
        MatchResult matchResult = new MatchResult();
        boolean isMatchOver = matchResult.isMatchOver(SuperOver.TARGET_RUNS, SuperOver.getTotalWicketsInHand(),22, SuperOver.BALLS_IN_OVERS);
        assertTrue(isMatchOver);
    }

    @Test
    public void isMatchTied(){
        // Match Tied
        MatchResult matchResult = new MatchResult();
        boolean isMatchOver = matchResult.isMatchOver(SuperOver.TARGET_RUNS, SuperOver.getTotalWicketsInHand(),20, SuperOver.BALLS_IN_OVERS);
        assertFalse(isMatchOver);
    }

    @Test
    public void battingStrategyToPlayAgainstBall(){
        Australia11 australia11 = new Australia11();
        Australia11.Result result = australia11.battingStrategyToPlayAgainstBall(BowlingOptions.BOUNCER);
        assertNotNull(result);
    }

    @Test
    public void getCommentaryStatement(){
        Australia11 australia11 = new Australia11();
        String commentaryStatement =  australia11.getCommentaryStatement(BowlingOptions.BOUNCER, BattingOptions.PULL, ShotTimings.LATE,Runs.WICKET);
        assertEquals(Commentary.EDGE_TAKEN.getName(),commentaryStatement);
    }

    @Test
    public void getRunScored(){
        Australia11 australia11 = new Australia11();
        Runs runs =  australia11.getRunScoredInOver(Austraila11Team.BROWN.getName(),BowlingOptions.BOUNCER, BattingOptions.PULL, ShotTimings.LATE,Runs.THREE);
        assertEquals(Runs.THREE.getName(),runs.getName());
    }



}
