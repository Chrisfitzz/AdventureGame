// Character.java
abstract class Character implements GameRules {

    protected String name;
    protected int level;
    private int health;
    private CharacterType type;

    public static final int MAX_HEALTH = 100;
    private static int totalCharacters = 0;
    private final String characterId;

    public Character(String name, int level, CharacterType type) {
        this.name = name;
        this.level = level;
        this.type = type;
        this.health = MAX_HEALTH;
        totalCharacters++;
        this.characterId = type.name() + "-" + totalCharacters;
    }

    public void displayStats() {
        System.out.println("\n[" + type + "] " + name + " - Level: " + level + " - Health: " + health);
    }

    public abstract void attack();

    @Override
    public abstract void applyLevelBonus();

    public final void heal(int amount) {
        health = Math.min(MAX_HEALTH, health + amount);
        System.out.println(name + " healed to " + health + " HP.");
    }

    public final void retire() {
        this.health = 0;
        System.out.println(name + " has retired from battle.");
    }

    public static int getTotalCharacters() {
        return totalCharacters;
    }

    public String getCharacterId() {
        return characterId;
    }

    public String getName() {
        return name;
    }

    public CharacterType getType() {
        return type;
    }
}

