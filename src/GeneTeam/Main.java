package GeneTeam;

interface Player{

    String name();
}

record BaseballPlayer(String name, String position) implements Player{}

