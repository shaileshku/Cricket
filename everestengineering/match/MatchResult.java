package application.everestengineering.match;

public class MatchResult {

    public boolean isMatchOver(Integer totalTarget, Integer wicketsInHands, Integer totalRunScored, int ballNo) {
        int runDifference = (totalTarget - totalRunScored);
        // Aus looses 2 wickets;
        if (wicketsInHands == 0) {
            System.out.println("Australia lost by " + runDifference + " Runs");
            return true;
        } else if (totalTarget < totalRunScored && wicketsInHands > 0) {
            System.out.println("Australia won by " + wicketsInHands + " wicket");
            return true;
        }else if (ballNo==6 && totalTarget > totalRunScored) {
            System.out.println("Australia lost by " + runDifference + " Runs with 0 balls Spare");
            return true;
        }else if(totalTarget == totalRunScored && ballNo == 6){
            System.out.println("Match Tied again..Its time for Super Over..");
        }

        return false;
    }
}
