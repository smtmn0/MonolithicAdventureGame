public class HealthElixir implements Item {
    @Override
    public void use(Player player) {
        player.heal(20);
        player.addItem("Health Elixir");
    }
}
