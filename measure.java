import java.util.*;

class measure{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter measure in inches: ");
        double i = sc.nextDouble();
        double m = i*(0.0254);
        System.out.print("Measure in meter: " + m);
    }
}