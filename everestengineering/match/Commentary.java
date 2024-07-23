package application.everestengineering.match;

import application.everestengineering.runs.Runs;

public enum Commentary {
    WICKET(1, "It’s a wicket."),
    LINE_LENGTH(1, "Excellent line and length."),
    EDGE_TAKEN(2, "Edged and taken."),
    HUGE_HIT(3, "It’s a huge hit."),
    OVER_FIELDER(4, "Just over the fielder."),
    EFFORT_ON_BOUNDARY(5, "Excellent effort on the boundary."),
    ONE_INTO_TWOS(6, "Convert ones into twos."),
    OUT_OF_THE_GROUND(7, "That’s massive and out of the ground."),
    RUNNING_BETWEEN_WICKETS(8, "Excellent running between the wickets"),
    NO_RUNS(8, "No Runs,dot ball");

    private int id;
    private String name;

    Commentary(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getPossibleCommentaryStatement(Runs runs) {
        return switch (runs) {
            case ONE -> Commentary.RUNNING_BETWEEN_WICKETS.getName();
            case TWO -> Commentary.ONE_INTO_TWOS.getName();
            case THREE -> Commentary.EFFORT_ON_BOUNDARY.getName();
            case FOUR -> Commentary.OVER_FIELDER.getName();
            case FIVE -> Commentary.RUNNING_BETWEEN_WICKETS.getName();
            case SIX -> Commentary.OUT_OF_THE_GROUND.getName();
            case WICKET -> WICKET.getName();
            case ZERO -> Commentary.NO_RUNS.getName();
        };
    }
}
