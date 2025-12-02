// Archer.java
class Archer extends Character implements SpecialAbility {

    private int arrows;
    private int agility;

    public Archer(String name, int level, int arrows, int agility) {
        super(name, level, CharacterType.ARCHER);
        this.arrows = arrows;
        this.agility = agility;
    }

    @Override
    public void attack() {
        if (arrows > 0) {
            arrows--;
            System.out.println(name + " shoots an arrow! (" + arrows + " arrows remaining)");
        } else {
            System.out.println(name + " has no arrows left!");
        }
    }

    @Override
    public void applyLevelBonus() {
        if (level % 5 == 0) {
            agility += 10;
            System.out.println(name + " gained an agility bonus! Agility is now " + agility);
        }
    }

    @Override
    public void useSpecial() {
        if (arrows >= 3) {
            arrows -= 3;
            System.out.println(name + " uses 'Rain of Arrows' for a deadly strike!");
        } else {
            System.out.println(name + " doesn’t have enough arrows for this move!");
        }
    }

    @Override
    public void displayStats() {
        super.displayStats();
        System.out.println("Arrows: " + arrows + ", Agility: " + agility);
    }
}
