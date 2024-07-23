package application.everestengineering.shots;

import java.util.ArrayList;
import java.util.List;

public enum ShotTimings {
    EARLY,GOOD,PERFECT,LATE;

    public static List<ShotTimings> getAllShortTimings() {
        List<ShotTimings> shortTimings = new ArrayList<>();
        shortTimings.add(ShotTimings.EARLY);
        shortTimings.add(ShotTimings.GOOD);
        shortTimings.add(ShotTimings.PERFECT);
        shortTimings.add(ShotTimings.LATE);
        return shortTimings;

    }
}
