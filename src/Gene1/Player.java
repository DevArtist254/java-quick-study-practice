package Gene1;

public interface Player {}

record BaseballPlayer(String name, int position) implements Player{}
record FootballPlayer(String name, int position) implements Player{}