public class MagicScroll implements Item {
    @Override
    public void use(Player player) {
        player.gainExperience(50);
        player.addItem("Magic Scroll");
    }
}
