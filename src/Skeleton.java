public class Skeleton implements Enemy {
    @Override
    public void attack(Player player) {
        player.takeDamage(10);
        player.gainExperience(20);
    }
}
