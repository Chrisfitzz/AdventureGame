// CharacterType.java
public enum CharacterType {
    WIZARD, ARCHER, WARRIOR;

    public static void filterByType(Character[] charactersList, CharacterType filterType) {
        System.out.println("Characters of type " + filterType + ":");
        for (Character c : charactersList) {
            if (c.getType() == filterType) {
                System.out.println("- " + c.getName() + " (" + c.getCharacterId() + ")");
            }
        }
        System.out.println();
    }
}

