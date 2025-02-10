import java.util.List;
import java.util.ArrayList;

public class LevelManager {
    private int currentLevel;
    private List<Enemy> levelEnemies;
    private List<Item> levelItems;

    public LevelManager() {
        this.currentLevel = 1;
        initializeLevel();
    }

    private void initializeLevel() {
        levelEnemies = new ArrayList<>();
        levelItems = new ArrayList<>();

        switch (currentLevel) {
            case 1:
                levelEnemies.add(new Skeleton());
                levelEnemies.add(new Skeleton());
                levelItems.add(new HealthElixir());
                break;
            case 2:
                levelEnemies.add(new Zombie());
                levelEnemies.add(new Zombie());
                levelItems.add(new HealthElixir());
                break;
            case 3:
                levelEnemies.add(new Vampire());
                levelItems.add(new MagicScroll());
                break;
        }
    }

    public void nextLevel(Player player) {
        currentLevel++;
        player.heal(100);
        initializeLevel();
    }

    public int getCurrentLevel() { return currentLevel; }
    public List<Enemy> getLevelEnemies() { return levelEnemies; }
    public List<Item> getLevelItems() { return levelItems; }
}
