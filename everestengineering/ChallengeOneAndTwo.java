package application.everestengineering;

import application.everestengineering.bowling.BowlingOptions;
import application.everestengineering.teams.Australia11;
import application.everestengineering.teams.India11;

public class ChallengeOneAndTwo {
    private static final Integer BALLS_IN_OVERS = 6;
    public static void main(String[] args) {

        for (int ballNo = 1; ballNo <= BALLS_IN_OVERS; ballNo++) {
            India11 india11 = new India11();
            BowlingOptions ballBowed = india11.bowling();
            // Australia is Batting.
            Australia11 australia11 = new Australia11();

            // Challenge 1 && Challenge 2
             australia11.batting(ballBowed, ballNo);
        }
    }
}
