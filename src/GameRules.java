// GameRules.java
interface GameRules {

    void applyLevelBonus();

    static void showRules() {
        System.out.println("- GAME RULES -");
        System.out.println("1. Max Health = 100");
        System.out.println("2. Level bonus applied every 5 levels.");
        System.out.println("3. Characters can retire using the retire() method.");
        System.out.println();
    }
}


