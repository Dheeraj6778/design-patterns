public class Driver {
    public static void main(String[] args) {
        Player player=new Player();
        player.setMovementStrategy(new RunStrategy());
        player.move();
        player.setMovementStrategy(new FlyStrategy());
        player.move();
        player.setMovementStrategy(new WalkStrategy());
        player.move();
    }
}
