// AdventureGame.java
public class AdventureGame {

    public static void main(String[] args) {

        GameRules.showRules();

        Character wizard = new Wizard("Descending Declan", 71, 11, 15);
        Character archer = new Archer("Frank Fingers", 43, 5, 30);
        Character warrior = new Warrior("Thug O'Malley", 95, 14, 20);
        Character[] party = { wizard, archer, warrior };

        // Display stats
        for (Character ch : party) ch.displayStats();

        // Each attacks and applies level bonus
        for (Character ch : party) {
            ch.attack();
            ch.applyLevelBonus();
        }

        // Filtering example
        CharacterType.filterByType(party, CharacterType.WIZARD);

        // Type-specific actions using instanceof
        System.out.println("\n* Special Abilities *");
        for (Character ch : party) {
            if (ch instanceof SpecialAbility) {
                SpecialAbility sa = (SpecialAbility) ch;
                sa.showAbilityInfo();
                sa.useSpecial();
            }
        }

        // Retire one character
        warrior.retire();

        // Print totals and summary
        GameUtility.printCharacterCount();
        GameUtility.printPartySummary(party);
    }
}

