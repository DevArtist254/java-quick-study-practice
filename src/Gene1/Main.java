package Gene1;

public class Main {
    public static void main(String[] args) {

        BaseballTeam philly = new BaseballTeam("Philadelphia Philly");
        BaseballTeam astros = new BaseballTeam("Huston Astros");

        scoreResult(philly, 4, astros, 3);

        var harper = new BaseballPlayer("B Harper", 7);
        var marsh = new BaseballPlayer("B Marsh", 4);

        philly.addTeamMember(harper);
        philly.addTeamMember(marsh);

        philly.ListTeamMembers();

        Team<FootballPlayer> afc = new Team<>("Adelaide Crows");

        var tex = new FootballPlayer("T Walker", 10);
        var roy = new FootballPlayer("K Roy", 8);

        afc.addTeamMember(tex);
        afc.addTeamMember(roy);

        afc.ListTeamMembers();
    }

    public static void scoreResult(BaseballTeam t1, int ts1, BaseballTeam t2, int ts2) {

        String message = t1.setScore(ts1, ts2);
        t2.setScore(ts2, ts1);

        System.out.printf("%s %s %s %n", t1, message, t2);
    }

    public static void scoreResult(Team t1, int ts1,Team t2, int ts2) {

        String message = t1.setScore(ts1, ts2);
        t2.setScore(ts2, ts1);

        System.out.printf("%s %s %s %n", t1, message, t2);
    }
}
