package Gene1;

import java.util.ArrayList;
import java.util.List;

public class SportsTeam {
    private String teamName;
    private List<Player> teamMembers = new ArrayList<>();
    private int totalWins = 0;
    private int totalLosses = 0;
    private int totalTies = 0;

    public SportsTeam(String teamName) {
        this.teamName = teamName;
    }

    public void addTeamMember(BaseballPlayer player) {

        if(!teamMembers.contains(player)){
            teamMembers.add(player);
        }
    }

    public void ListTeamMembers(){

        System.out.println(teamName + " Roster: ");
        System.out.println(teamMembers);

    }

    public int ranking(){
        return (totalLosses * 2) + totalTies + 1;
    }

    public String setScore(int ourScore, int theirScore) {

        String message = "lost to";
        if(ourScore > theirScore) {
            totalWins++;
            message = "We won!";
        } else if(ourScore == theirScore) {
            totalTies++;
            message = "We tied";
        } else {
            totalLosses++;
        }

        return message;
    }

    public String toString(){
        return teamName + " (Ranked " + ranking() + " )";
    }

}