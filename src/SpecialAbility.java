// SpecialAbility.java
interface SpecialAbility {
    void useSpecial();

    default void showAbilityInfo() {
        System.out.println("Special Ability: This character can unleash a unique power!");
    }
}
