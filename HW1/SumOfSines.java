public class SumOfSines {
    public static void main(String[] args) {
        double d = Double.parseDouble(args[0]);
        double r = Math.toRadians(d);
        System.out.println(Math.sin(2 * r) + Math.sin(3 * r));
    }
}
