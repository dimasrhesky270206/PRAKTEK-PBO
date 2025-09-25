package QUIZ_PRAKTIKUM;

class BossMonster extends Monster {
    public BossMonster(String name, int health, int attackPower, String type) {
        super(name, health, attackPower, type);
    }

    @Override
    public void attack(Character target) {
        int damage = ((int)(Math.random() * 10) + 5) * 2; // double damage
        System.out.println(getName() + " (Boss) unleashes a special attack! Damage: " + damage);
        target.takeDamage(damage);
    }
}