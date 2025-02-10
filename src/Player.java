import java.util.ArrayList;
import java.util.List;

public class Player {
    private final String name;
    private int health;
    private int experience;
    private final List<String> inventory;

    public Player(String name) {
        this.name = name;
        this.health = 100;
        this.experience = 0;
        this.inventory = new ArrayList<>();
    }

    public void takeDamage(int damage) {
        health = Math.max(0, health - damage);
    }

    public void heal(int amount) {
        health = Math.min(100, health + amount);
    }

    public void gainExperience(int xp) {
        experience += xp;
    }

    public void addItem(String item) {
        inventory.add(item);
    }

    public List<String> getInventory() {
        return new ArrayList<>(inventory);
    }

    public boolean isAlive() { return health > 0; }
    public int getHealth() { return health; }
    public int getExperience() { return experience; }
}
