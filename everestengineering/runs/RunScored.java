package application.everestengineering.runs;

import application.everestengineering.shots.ShotTimings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RunScored {
    private HashMap<String, List<Runs>> earlySelection = new HashMap<>();
    private HashMap<String, List<Runs>> goodSelection = new HashMap<>();
    private HashMap<String, List<Runs>> perfectSelection = new HashMap<>();
    private HashMap<String, List<Runs>> lateSelection = new HashMap<>();

    public void addEarlySelection() {
        earlySelection.put(ShotTimings.EARLY.name(), getProbableOutcomeAgainstEarlyShot());
    }

    private List<Runs> getProbableOutcomeAgainstEarlyShot() {
        List<Runs> runsScoredAgainstEarlyShort = new ArrayList<>();
        runsScoredAgainstEarlyShort.add(Runs.ONE);
        runsScoredAgainstEarlyShort.add(Runs.TWO);
        return runsScoredAgainstEarlyShort;

    }

    public void addGoodSelection() {
        goodSelection.put(ShotTimings.GOOD.name(), getProbableOutcomeAgainstGoodShot());
    }

    private List<Runs> getProbableOutcomeAgainstGoodShot() {
        List<Runs> runsScoredAgainstEarlyShort = new ArrayList<>();
        runsScoredAgainstEarlyShort.add(Runs.TWO);
        runsScoredAgainstEarlyShort.add(Runs.THREE);
        return runsScoredAgainstEarlyShort;

    }

    public void addPerfectSelection() {
        perfectSelection.put(ShotTimings.PERFECT.name(), getProbableOutcomeAgainstPerfectShot());
    }

    private List<Runs> getProbableOutcomeAgainstPerfectShot() {
        List<Runs> runsScoredAgainstEarlyShort = new ArrayList<>();
        runsScoredAgainstEarlyShort.add(Runs.FOUR);
        runsScoredAgainstEarlyShort.add(Runs.SIX);
        return runsScoredAgainstEarlyShort;

    }

    public void addLateSelection() {
        lateSelection.put(ShotTimings.LATE.name(), getProbableOutcomeAgainstLateShot());
    }

    private List<Runs> getProbableOutcomeAgainstLateShot() {
        List<Runs> runsScoredAgainstEarlyShort = new ArrayList<>();
        runsScoredAgainstEarlyShort.add(Runs.WICKET);
        return runsScoredAgainstEarlyShort;

    }

    public List<Runs> getRunScoredBasedOnShortTimings(ShotTimings shortTiming) {
        List<Runs> runs = new ArrayList<>();
        switch (shortTiming) {
            case EARLY -> runs = getProbableOutcomeAgainstEarlyShot();
            case GOOD -> runs = getProbableOutcomeAgainstGoodShot();
            case PERFECT -> runs = getProbableOutcomeAgainstPerfectShot();
            case LATE -> runs = getProbableOutcomeAgainstLateShot();
        }
        return runs;
    }


}
