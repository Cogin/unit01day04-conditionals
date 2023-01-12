public class Quadratic {
    public static void main(String[] args) {
        //check args
        if (args.length != 3) {
            System.out.println("3 Arguments expected, got " + args.length);
            System.exit(1);
        }
        //parse args
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        //check if a is 0
        if (a == 0) {
            double x1 = -(c) / b;
            if (Double.isNaN(x1)) {
                System.out.println("No answers found to the quadratic equation.");
                System.exit(0);}

            System.out.println(
            String.format(
            "%sx^2 + %sx + %s = 0 has the solutions: ",
            args[0], args[1], args[2])+ x1);

            
        }
        else {
            double x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
            double x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
            if (Double.isNaN(x1)) {
                System.out.println("No answers found to the quadratic equation.");
                System.exit(0);
            }
            System.out.println(
            String.format(
            "%sx^2 + %sx + %s = 0 has the solutions: ",
            args[0], args[1], args[2])+ x1 + " and " + x2);

        }

    


    }
}
