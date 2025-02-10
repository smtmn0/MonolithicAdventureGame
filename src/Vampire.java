public class Vampire implements Enemy {
    @Override
    public void attack(Player player) {
        player.takeDamage(20);
        player.gainExperience(40);
    }
}
