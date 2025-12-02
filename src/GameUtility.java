// GameUtility.java
final class GameUtility {
    private GameUtility() {}

    public static void printPartySummary(Character[] party) {
        System.out.println("\n* PARTY SUMMARY *");
        for (Character c : party) {
            c.displayStats();
        }
        System.out.println();
    }

    public static void printCharacterCount() {
        System.out.println("Total Characters Created: " + Character.getTotalCharacters());
        System.out.println();
    }
}

