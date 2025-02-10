import java.util.List;

public class GameController {
    private final Player player;
    private final LevelManager levelManager;
    private EnemyManager enemyManager;
    private ItemManager itemManager;

    public GameController() {
        this.player = new Player("Adventurer");
        this.levelManager = new LevelManager();
        updateManagers();
    }

    private void updateManagers() {
        this.enemyManager = new EnemyManager(levelManager.getLevelEnemies());
        this.itemManager = new ItemManager(levelManager.getLevelItems());
    }

    public void startGame() {
        while (player.isAlive() && levelManager.getCurrentLevel() <= 3) {
            System.out.println("\n=== Level " + levelManager.getCurrentLevel() + " ===");

            enemyManager.processCombat(player);
            if (!player.isAlive()) break;

            itemManager.processItems(player);
            if (!player.isAlive()) break;

            displayInventory();

            levelManager.nextLevel(player);
            updateManagers();
        }
        endGame();
    }

    private void displayInventory() {
        List<String> inventory = player.getInventory();
        System.out.println("Player's Inventory: " + (inventory.isEmpty() ? "Empty" : inventory));
    }

    private void endGame() {
        if (player.isAlive()) {
            System.out.println("\nCongratulations! Total XP: " + player.getExperience());
        } else {
            System.out.println("\nGame Over! Reached level: " + levelManager.getCurrentLevel());
        }
    }

    public static void main(String[] args) {
        new GameController().startGame();
    }
}
