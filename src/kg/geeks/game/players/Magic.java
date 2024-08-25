package kg.geeks.game.players;

public class Magic extends Hero {
    private int boostDamage;

    public Magic(String name, int health, int damage, int boostDamage) {
        super(name, health, damage, SuperAbility.BOOST);
        this.boostDamage = boostDamage;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        increaseAttackEachRound(heroes);
    }

    public void increaseAttackEachRound(Hero[] heroes) {
        for (Hero hero : heroes) {
            if (hero.getHealth() > 0) {
                hero.setDamage(hero.getDamage() + this.boostDamage);
            }
        }
        System.out.println("Magic " + this.getName() + " увеличивает атаку героев ");
    }
}