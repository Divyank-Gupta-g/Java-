import java.util.*;

class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double n = sc.nextDouble();
        
        System.out.printf("Square: %.2f \n", Math.pow(n, 2));
        System.out.printf("Cube: %.2f \n", Math.pow(n, 3));
        System.out.printf("Fourth power: %.2f", Math.pow(n, 4));
    }
}