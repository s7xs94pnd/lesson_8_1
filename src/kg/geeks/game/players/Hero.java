package kg.geeks.game.players;

public abstract class Hero extends GameEntity {
    private SuperAbility ability;
    private int maxHealth;

    public Hero(String name, int health, int damage, SuperAbility ability) {
        super(name, health, damage);
        this.ability = ability;
        this.maxHealth = health;
    }

    public SuperAbility getAbility() {
        return ability;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void attack(Boss boss) {
        boss.setHealth(boss.getHealth() - this.getDamage());
    }

    public abstract void applySuperPower(Boss boss, Hero[] heroes);
}