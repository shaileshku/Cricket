package application.everestengineering.batting;

public enum BattingOptions {
    STRAIGHT(1, "STRAIGHT"),
    FLICK(2, "FLICK"),
    LEG_GLANCE(3, "LEG_GLANCE"),
    LONG_ON(4, "LONG_ON"),
    SQUARE_CUT(5, "SQUARE_CUT"),
    SWEEP(6, "SWEEP"),
    COVER_DRIVE(7, "COVER_DRIVE"),
    PULL(8, "PULL"),
    SCOOP(9, "SCOOP"),
    UPPER_CUT(10, "UPPER_CUT");

    private int id;
    private String name;

    BattingOptions(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }
}
