public class ThreeEqual {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("3 Arguments expected, got " + args.length);
            System.exit(1);
        }

        Integer x1 = Integer.parseInt(args[0]);
        Integer x2 = Integer.parseInt(args[1]);
        Integer x3 = Integer.parseInt(args[2]);

        String equalmsg = (x1 == x2 && x1 == x3) ? "equal" : "not equal";
        System.out.println(equalmsg);
    }
}