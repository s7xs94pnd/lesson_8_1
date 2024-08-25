package kg.geeks.game.players;

public class Bomber extends Hero {
    public Bomber(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.EXPLOSION_ON_DEATH);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {

    }

    public void explodeIfDead(Boss boss) {
        if (this.getHealth() <= 0) {
            boss.setHealth(boss.getHealth() - 100);
            System.out.println("Bomber " + this.getName() + " exploded  100 damage boss.");
        }
    }
}