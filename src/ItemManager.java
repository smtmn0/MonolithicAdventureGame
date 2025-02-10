import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ItemManager {
    private List<Item> items;

    public ItemManager(List<Item> items) {
        this.items = new ArrayList<>(items);
    }

    public void processItems(Player player) {
        Iterator<Item> iterator = items.iterator();
        while (iterator.hasNext() && player.isAlive()) {
            Item item = iterator.next();
            item.use(player);
            iterator.remove();
        }
    }
}
