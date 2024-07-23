package application.everestengineering.bowling;

import java.util.ArrayList;
import java.util.List;

public enum BowlingOptions {
    BOUNCER(1, "BOUNCER"),
    OUT_SWINGER(2, "OUT_SWINGER"),
    OFF_CUTTER(3, "OFF_CUTTER"),
    YORKER(4, "YORKER"),
    OFF_BREAK(5, "OFF_BREAK"),
    IN_SWINGER(6, "IN_SWINGER"),
    LEG_CUTTER(7, "LEG_CUTTER"),
    SLOW_BALL(8, "SLOW_BALL"),
    PACE(9, "PACE"),
    DOOSRA(10, "DOOSRA");

    private int id;
    private String name;

    BowlingOptions(int id, String name) {
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

    public static List<BowlingOptions> getAllBowlingOptionsAvailable() {
        List<BowlingOptions> bowlingOptions = new ArrayList<>();
        bowlingOptions.add(BowlingOptions.BOUNCER);
        bowlingOptions.add(BowlingOptions.OUT_SWINGER);
        bowlingOptions.add(BowlingOptions.OFF_CUTTER);
        bowlingOptions.add(BowlingOptions.YORKER);
        bowlingOptions.add(BowlingOptions.OFF_BREAK);
        bowlingOptions.add(BowlingOptions.IN_SWINGER);
        bowlingOptions.add(BowlingOptions.LEG_CUTTER);
        bowlingOptions.add(BowlingOptions.SLOW_BALL);
        bowlingOptions.add(BowlingOptions.PACE);
        bowlingOptions.add(BowlingOptions.DOOSRA);
        return bowlingOptions;

    }
}
