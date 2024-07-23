package application.everestengineering.teams;
import java.util.ArrayList;
import java.util.List;

public enum India11Team {
    RANGANATHAN(1, "Ranganathan B"),
    SUDHAKAR(2, "Sudhakar Dharwada"),
    FAIZ(3, "Mohammed Faizuddin"),
    LAKSHMI(4, "Lakshmi Prasanna"),
    VARENYA(5, "Varenya Raj"),
    VENKATESHWAR(6, "Venkateshwar K"),
    NAVEEN(7, "Naveen Kumar B"),
    NIDHURAJ(8, "Nidhuraj"),
    RAVI(9, "Ravinder Deolal"),
    ANIRUDH(10, "Anirudh B S");

    private int id;
    private String name;

    India11Team(int id, String name) {
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

    public static List<India11Team> getIndia11() {
        List<India11Team> india11Teams = new ArrayList<>();
        india11Teams.add(India11Team.RANGANATHAN);
        india11Teams.add(India11Team.SUDHAKAR);
        india11Teams.add(India11Team.FAIZ);
        india11Teams.add(India11Team.LAKSHMI);
        india11Teams.add(India11Team.VENKATESHWAR);
        india11Teams.add(India11Team.VARENYA);
        india11Teams.add(India11Team.NAVEEN);
        india11Teams.add(India11Team.NIDHURAJ);
        india11Teams.add(India11Team.RAVI);
        india11Teams.add(India11Team.ANIRUDH);
        return india11Teams;

    }
}
