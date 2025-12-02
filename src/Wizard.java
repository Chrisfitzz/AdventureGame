// Wizard.java
class Wizard extends Character implements SpecialAbility {

    private int spells;
    private int wisdom;

    public Wizard(String name, int level, int spells, int wisdom) {
        super(name, level, CharacterType.WIZARD);
        this.spells = spells;
        this.wisdom = wisdom;
    }

    @Override
    public void attack() {
        if (spells > 0) {
            spells--;
            System.out.println(name + " casts a spell! (" + spells + " spells remaining)");
        } else {
            System.out.println(name + " has no spells left!");
        }
    }

    @Override
    public void applyLevelBonus() {
        if (level % 5 == 0) {
            wisdom += 10;
            System.out.println(name + " gained a wisdom bonus! Wisdom is now " + wisdom);
        }
    }

    @Override
    public void useSpecial() {
        if (spells >= 2) {
            spells -= 2;
            System.out.println(name + " uses 'Mega spell slam' for devastating damage!");
        } else {
            System.out.println(name + " doesn’t have enough spells for a special move!");
        }
    }

    @Override
    public void displayStats() {
        super.displayStats();
        System.out.println("Spells: " + spells + ", Wisdom: " + wisdom);
    }
}
