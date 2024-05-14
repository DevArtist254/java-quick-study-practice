package GeneTeam;

import java.util.ArrayList;
import java.util.List;

record Affiliation(String name, String type, String countryCode) {

    @Override
    public String toString(){ return "{Name: " +name+ " Type: " +type+ " Country code: " + countryCode + " }";
}

public class Team<T extends Player, S> {

    private String teamName;
    private List<T> teamPlayers = new ArrayList<>();
    private int totalWins;
    private int totalLosses;
    private int totalTies;
    private S affiliation;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public Team(String teamName, S affiliation) {
        this.teamName = teamName;
        this.affiliation = affiliation;
    }

    public void addTeamMember(T t) {

        if (!teamPlayers.contains(t)) {
            teamPlayers.add(t);
        }
    }

    public void listTeamMembers() {
        System.out.println(teamName + " Roster:");
        System.out.println(affiliation == null ? "" : "Affiliation " + affiliation);

        for (T t : teamPlayers) {
            System.out.println(t.name());
        }
    }

    public int ranking() {
        return (totalLosses * 2) + totalTies + 1;
    }

    public String setScore(int ourScore, int theirScore) {

        String message = "lost to";
        if (ourScore > theirScore) {
            totalWins++;
            message = "beat";
        } else if (ourScore == theirScore) {
            totalTies++;
            message = "tied";
        } else {
            totalLosses++;
        }

        return message;
    }

    @Override
    public String toString() {
        return teamName + " (Ranked " + ranking() + " )";
    };
}}
