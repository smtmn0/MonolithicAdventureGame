public class Zombie implements Enemy {
    @Override
    public void attack(Player player) {
        player.takeDamage(15);
        player.gainExperience(30);
    }
}
