import java.util.*;

class temp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in fahrenheit: ");
        double t = sc.nextDouble();
        double c = (5*(t-32))/9;
        System.out.println("Temperature in celcius: " + c);
    }
}