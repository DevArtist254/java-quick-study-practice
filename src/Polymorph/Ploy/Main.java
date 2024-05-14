package Polymorph.Ploy;

public class Main {

    public static void main(String[] args) {

        var player = new Ploy();

        player.fullName = "Tim";
        player.health = 40;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        player.loseHealth(damage);

        System.out.println("Remaining health = " + player.healthRem());

        player.health = 200;
        player.loseHealth(11);

        System.out.println("Remaining health = " + player.healthRem());

        EnhancedPlayer player2 = new EnhancedPlayer("Kevin", 300, "sword");

        System.out.println(player2);

    }

}
