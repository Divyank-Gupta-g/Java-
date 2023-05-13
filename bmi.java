import java.util.*;

class bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in pounds = ");
        double w = sc.nextDouble();
        System.out.print("Enter height in inches = ");
        double h = sc.nextDouble();
        double BMI = (w*0.453592)/(h*0.0254 * h*0.0254);
        System.out.println("BMI: " + BMI);
    }
}