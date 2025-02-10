import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class EnemyManager {
    private List<Enemy> enemies;

    public EnemyManager(List<Enemy> enemies) {
        this.enemies = new ArrayList<>(enemies);
    }

    public void processCombat(Player player) {
        Iterator<Enemy> iterator = enemies.iterator();
        while (iterator.hasNext() && player.isAlive()) {
            Enemy enemy = iterator.next();
            enemy.attack(player);
            iterator.remove();
        }
    }
}
