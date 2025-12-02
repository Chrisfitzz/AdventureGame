// Warrior.java
class Warrior extends Character implements SpecialAbility {

    private int hammers;
    private int strength;

    public Warrior(String name, int level, int hammers, int strength) {
        super(name, level, CharacterType.WARRIOR);
        this.hammers = hammers;
        this.strength = strength;
    }

    @Override
    public void attack() {
        if (hammers > 0) {
            hammers--;
            System.out.println(name + " swings a mighty hammer! (" + hammers + " hammers remaining)");
        } else {
            System.out.println(name + " has no hammers left!");
        }
    }

    @Override
    public void applyLevelBonus() {
        if (level % 5 == 0) {
            strength += 10;
            System.out.println(name + " gained a strength bonus! Strength is now " + strength);
        }
    }

    @Override
    public void useSpecial() {
        if (hammers >= 2) {
            hammers -= 2;
            System.out.println(name + " uses 'Hammer Hurricane' to crush enemies!");
        } else {
            System.out.println(name + " doesn’t have enough hammers for this move!");
        }
    }

    @Override
    public void displayStats() {
        super.displayStats();
        System.out.println("Hammers: " + hammers + ", Strength: " + strength);
    }
}
