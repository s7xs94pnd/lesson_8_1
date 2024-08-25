package kg.geeks.game.players;

public class Reaper extends Hero {
    public Reaper(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.DAMAGE_MULTIPLIER);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int multiplier = 1;
        if (this.getHealth() < 0.15 * this.getMaxHealth()) {
            multiplier = 3;
        } else if (this.getHealth() < 0.30 * this.getMaxHealth()) {
            multiplier = 2;
        }
        boss.setHealth(boss.getHealth() - multiplier * this.getDamage());
        System.out.println("Reaper " + this.getName() + " damage with: " + multiplier + "x");
    }
}