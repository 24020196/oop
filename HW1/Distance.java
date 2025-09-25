

public class Distance {
    public static void main(String[] args) {
        double result=0 ;
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        result = Math.sqrt(a*a+b*b);
        System.out.println(result);
    }
}
