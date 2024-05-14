package Polymorph.Ploy;

public class EnhancedPlayer {

    private String fullName;
    private int health;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon){
        this.fullName = name;
        this.weapon = weapon;
        this.health = setHealth(health);
    }

    private int setHealth(int health){
        var h = health;

        if (health <= 0) h = 1;
        if (health > 100)  h = 100;

        return h;

    }

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

    @Override
    public String toString(){
        return "Name :" +fullName+ "weapon :" +weapon+ "health :" +health+ ".";
    }
}
