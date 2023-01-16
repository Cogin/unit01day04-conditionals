// FIXME: I think you will sometimes roll zeros
public class RollLoadedDie {
    public static void main(String[] args) {
        Integer chance = (int) (Math.random() * 8);
        System.out.println(chance);
        if (chance < 5) {
            System.out.println("You rolled " + (int) (Math.random() * 5));
        }
        else {
            System.out.println("You rolled 6!");
        }
    }
}
