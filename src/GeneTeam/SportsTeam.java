package GeneTeam;

import java.util.ArrayList;
import java.util.List;

public class SportsTeam {
    private String teamName;
    private List<Player> teamPlayers = new ArrayList<>();
    private int totalWins;
    private int totalLosses;
    private int totalTies;

    public SportsTeam(String teamName) {
        this.teamName = teamName;
    }


    public void addTeamMember(Player t){

        if(!teamPlayers.contains(t)){
            teamPlayers.add(t);
        }
    }

    public void listTeamMembers(){
        System.out.println(teamName + " Roster:");

        for(Player t : teamPlayers){
            System.out.println(t.name());
        }
    }

    public int ranking(){
        return (totalLosses * 2) + totalTies + 1;
    }

    public String setScore(int ourScore, int theirScore){

        String message = "lost to";
        if(ourScore > theirScore){
            totalWins++;
            message="beat";
        } else if (ourScore == theirScore) {
            totalTies++;
            message="tied";
        } else {
            totalLosses++;
        }

        return message;
    }

    @Override
    public String toString(){
        return teamName + " (Ranked " +ranking()+ " )";
    }
}
