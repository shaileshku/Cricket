package application.everestengineering.batting;

import application.everestengineering.bowling.BowlingOptions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BattingStrategy  {
    private HashMap<String, List<BattingOptions>> bouncerOptions = new HashMap<>();
    private HashMap<String, List<BattingOptions>> outSwingerOptions = new HashMap<>();
    private HashMap<String, List<BattingOptions>> offCutterOptions = new HashMap<>();
    private HashMap<String, List<BattingOptions>> yorkerOptions = new HashMap<>();
    private HashMap<String, List<BattingOptions>> offBreakOptions = new HashMap<>();
    private HashMap<String, List<BattingOptions>> inSwingerOptions = new HashMap<>();
    private HashMap<String, List<BattingOptions>> legCutterOptions = new HashMap<>();
    private HashMap<String, List<BattingOptions>> slowBallOptions = new HashMap<>();
    private HashMap<String, List<BattingOptions>> paceOptions = new HashMap<>();
    private HashMap<String, List<BattingOptions>> doosraOptions = new HashMap<>();

    public void addBouncerOptions() {
        bouncerOptions.put(BowlingOptions.BOUNCER.getName(), getBattingOptionsAgainstBouncer());
    }

    private List<BattingOptions> getBattingOptionsAgainstBouncer() {
        List<BattingOptions> battingOptionsAgainstBouncer = new ArrayList<>();
        battingOptionsAgainstBouncer.add(BattingOptions.UPPER_CUT);
        battingOptionsAgainstBouncer.add(BattingOptions.PULL);
        return battingOptionsAgainstBouncer;

    }

    public void addOutSwingerOptions() {
        outSwingerOptions.put(BowlingOptions.OUT_SWINGER.getName(), getBattingOptionsAgainstOutSwinger());
    }

    private List<BattingOptions> getBattingOptionsAgainstOutSwinger() {
        List<BattingOptions> battingOptionsAgainstOutSwinger= new ArrayList<>();
        battingOptionsAgainstOutSwinger.add(BattingOptions.STRAIGHT);
        battingOptionsAgainstOutSwinger.add(BattingOptions.COVER_DRIVE);
        battingOptionsAgainstOutSwinger.add(BattingOptions.PULL);
        battingOptionsAgainstOutSwinger.add(BattingOptions.SQUARE_CUT);
        return battingOptionsAgainstOutSwinger;

    }

    public void addOffCutterOptions() {
        offCutterOptions.put(BowlingOptions.OFF_CUTTER.getName(), getBattingOptionsAgainstOffCutter());
    }

    private List<BattingOptions> getBattingOptionsAgainstOffCutter() {
        List<BattingOptions> battingOptionsAgainstOffCutter = new ArrayList<>();
        battingOptionsAgainstOffCutter.add(BattingOptions.STRAIGHT);
        battingOptionsAgainstOffCutter.add(BattingOptions.COVER_DRIVE);
        battingOptionsAgainstOffCutter.add(BattingOptions.PULL);
        battingOptionsAgainstOffCutter.add(BattingOptions.SQUARE_CUT);
        return battingOptionsAgainstOffCutter;

    }

    public void addYorkerOptions() {
        yorkerOptions.put(BowlingOptions.YORKER.getName(), getBattingOptionsAgainstYorker());
    }

    private List<BattingOptions> getBattingOptionsAgainstYorker() {
        List<BattingOptions> battingOptionsAgainstYorker = new ArrayList<>();
        battingOptionsAgainstYorker.add(BattingOptions.STRAIGHT);
        battingOptionsAgainstYorker.add(BattingOptions.SCOOP);
        battingOptionsAgainstYorker.add(BattingOptions.FLICK);
        return battingOptionsAgainstYorker;

    }

    public void addOffBreakOptionsOptions() {
        offBreakOptions.put(BowlingOptions.OFF_BREAK.getName(), getBattingOptionsAgainstOffBreakOptions());
    }

    private List<BattingOptions> getBattingOptionsAgainstOffBreakOptions() {
        List<BattingOptions> battingOptionsAgainstOffBreak = new ArrayList<>();
        battingOptionsAgainstOffBreak.add(BattingOptions.STRAIGHT);
        battingOptionsAgainstOffBreak.add(BattingOptions.SWEEP);
        battingOptionsAgainstOffBreak.add(BattingOptions.COVER_DRIVE);
        battingOptionsAgainstOffBreak.add(BattingOptions.LONG_ON);
        return battingOptionsAgainstOffBreak;

    }

    public void addInSwingerOptions() {
        inSwingerOptions.put(BowlingOptions.IN_SWINGER.getName(), getBattingOptionsAgainstInSwinger());
    }

    private List<BattingOptions> getBattingOptionsAgainstInSwinger() {
        List<BattingOptions> battingOptionsAgainstInSwinger = new ArrayList<>();
        battingOptionsAgainstInSwinger.add(BattingOptions.STRAIGHT);
        battingOptionsAgainstInSwinger.add(BattingOptions.PULL);
        battingOptionsAgainstInSwinger.add(BattingOptions.LEG_GLANCE);
        battingOptionsAgainstInSwinger.add(BattingOptions.FLICK);
        return battingOptionsAgainstInSwinger;

    }

    public void addLegCutterOptions() {
        legCutterOptions.put(BowlingOptions.LEG_CUTTER.getName(), getBattingOptionsAgainstLegCutter());
    }

    private List<BattingOptions> getBattingOptionsAgainstLegCutter() {
        List<BattingOptions> battingOptionsAgainstLegCutter = new ArrayList<>();
        battingOptionsAgainstLegCutter.add(BattingOptions.STRAIGHT);
        battingOptionsAgainstLegCutter.add(BattingOptions.PULL);
        battingOptionsAgainstLegCutter.add(BattingOptions.LEG_GLANCE);
        battingOptionsAgainstLegCutter.add(BattingOptions.FLICK);
        return battingOptionsAgainstLegCutter;

    }

    public void addSlowBallOptions() {
        slowBallOptions.put(BowlingOptions.SLOW_BALL.getName(), getBattingOptionsAgainstSlowBall());
    }

    private List<BattingOptions> getBattingOptionsAgainstSlowBall() {
        List<BattingOptions> battingOptionsAgainstSlowBall = new ArrayList<>();
        battingOptionsAgainstSlowBall.add(BattingOptions.STRAIGHT);
        battingOptionsAgainstSlowBall.add(BattingOptions.COVER_DRIVE);
        battingOptionsAgainstSlowBall.add(BattingOptions.PULL);
        battingOptionsAgainstSlowBall.add(BattingOptions.SQUARE_CUT);
        return battingOptionsAgainstSlowBall;

    }

    public void addPaceOptions() {
        paceOptions.put(BowlingOptions.PACE.getName(), getBattingOptionsAgainstPace());
    }

    private List<BattingOptions> getBattingOptionsAgainstPace() {
        List<BattingOptions> battingOptionsAgainstPace = new ArrayList<>();
        battingOptionsAgainstPace.add(BattingOptions.PULL);
        battingOptionsAgainstPace.add(BattingOptions.STRAIGHT);
        battingOptionsAgainstPace.add(BattingOptions.COVER_DRIVE);
        battingOptionsAgainstPace.add(BattingOptions.SQUARE_CUT);
        return battingOptionsAgainstPace;

    }

    public void addDoosraOptions() {
        doosraOptions.put(BowlingOptions.DOOSRA.getName(), getBattingOptionsAgainstDoosra());
    }

    private List<BattingOptions> getBattingOptionsAgainstDoosra() {
        List<BattingOptions> battingOptionsAgainstDoosra = new ArrayList<>();
        battingOptionsAgainstDoosra.add(BattingOptions.SQUARE_CUT);
        battingOptionsAgainstDoosra.add(BattingOptions.COVER_DRIVE);
        return battingOptionsAgainstDoosra;

    }

    public List<BattingOptions> getBattingStrategyToPlayAgainstBall(BowlingOptions ballBowled) {
        List<BattingOptions> battingOptions = new ArrayList<>();
        switch (ballBowled){
            case BOUNCER ->
                battingOptions =   getBattingOptionsAgainstBouncer();
            case OUT_SWINGER ->
                battingOptions =  getBattingOptionsAgainstOutSwinger();
            case OFF_CUTTER ->
                battingOptions =  getBattingOptionsAgainstOffCutter();
            case YORKER ->
                battingOptions = getBattingOptionsAgainstYorker();
            case OFF_BREAK ->
                battingOptions = getBattingOptionsAgainstOffBreakOptions();
            case IN_SWINGER ->
                battingOptions =  getBattingOptionsAgainstInSwinger();
            case LEG_CUTTER ->
                battingOptions = getBattingOptionsAgainstLegCutter();
            case SLOW_BALL ->
                battingOptions = getBattingOptionsAgainstSlowBall();
            case PACE ->
                battingOptions = getBattingOptionsAgainstPace();
            case DOOSRA ->
                battingOptions = getBattingOptionsAgainstDoosra();

        }
        return battingOptions;
    }

}
