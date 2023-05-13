import java.util.*;

class maths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        double a = sc.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = sc.nextDouble();

        System.out.println("Sum: " + (a+b));
        System.out.println("Difference: " + (a-b));
        System.out.println("Product: " + (a*b));
        System.out.println("Average: " + (a+b)/2);

        double max = Math.max(a, b);
        double min = Math.min(a, b);

        System.out.println("Distance: " + (max-min));
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}