package application.everestengineering.teams;

import java.util.ArrayList;
import java.util.List;

public enum Austraila11Team {
    BROWN(1, "Craig Brown"),
    JONES(2, "Chris Jones"),
    MARTIN(3, "Martin Chesbrough"),
    THOMAS(4, "Ringo Thomas"),
    BENJAMIN(5, "Benjamin Blackwood"),
    DANIEL(6, "Daniel Prager"),
    ASAD(7, "Asad Naveed"),
    BRENT(8, "Brent Snook"),
    RICK(9, "Rick Giner"),
    CHARLOTEE(10, "Charlotte");

    private int id;
    private String name;

    Austraila11Team(int id, String name) {
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

    public static List<Austraila11Team> getAustralia11() {
        List<Austraila11Team> australia11Teams = new ArrayList<>();
        australia11Teams.add(Austraila11Team.BROWN);
        australia11Teams.add(Austraila11Team.JONES);
        australia11Teams.add(Austraila11Team.MARTIN);
        australia11Teams.add(Austraila11Team.THOMAS);
        australia11Teams.add(Austraila11Team.BENJAMIN);
        australia11Teams.add(Austraila11Team.ASAD);
        australia11Teams.add(Austraila11Team.DANIEL);
        australia11Teams.add(Austraila11Team.BRENT);
        australia11Teams.add(Austraila11Team.RICK);
        australia11Teams.add(Austraila11Team.CHARLOTEE);
        return australia11Teams;

    }
}
