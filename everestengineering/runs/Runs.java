package application.everestengineering.runs;

public enum Runs {
    WICKET(0,"Wicket"),ONE(1,"1"),TWO(2,"2"),THREE(3,"3"),FOUR(4,"4"),FIVE(5,"5"),SIX(6,"6"),ZERO(0,"0");

    private int id;
    private String name;

    Runs(int id, String name) {
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
