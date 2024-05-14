package Polymorph.Ploy;

public class Ploy {

    public String fullName;
    public int health;
    public String weapon;

    public void loseHealth(int damage){

        health = health - damage;
        if (health <= 0) {
            System.out.println("Player knocked out of game");
            health = 0;
        }
    }

    public int healthRem() { return health; }

    public void restoreHealth(int extraHealth){

        health += extraHealth;

        if (health > 100) {
            System.out.println("Player restored to 100%");
            health = 100;
        }
    }
}
