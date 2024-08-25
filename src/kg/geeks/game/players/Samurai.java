package kg.geeks.game.players;

import java.util.Random;

public class Samurai extends Hero {
    private static final Random random = new Random();

    public Samurai(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.SHURIKENS);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (random.nextBoolean()) {
            boss.setHealth(boss.getHealth() - this.getDamage());
            System.out.println("Samurai " + this.getName() + " threw  damage: " + this.getDamage());
        } else {
            boss.setHealth(boss.getHealth() + this.getDamage());
            System.out.println("Samurai " + this.getName() + " threw  healing the boss: " + this.getDamage());
        }
    }
}