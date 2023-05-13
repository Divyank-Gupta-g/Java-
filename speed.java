import java.util.*;

class speed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance in meters: ");
        double d = sc.nextDouble();
        System.out.print("Enter time in hrs: ");
        int h = sc.nextInt();
        System.out.print("Enter time in mnts: ");
        int m = sc.nextInt();
        System.out.print("Enter time in sec: ");
        int s = sc.nextInt();
       
        double sp1 = d/((h*60*60) + (m*60) + s);
        double sp2 = (d/1000)/(h + (m/60) + (s/3600));
        double sp3 = (d/1609)/(h + (m/60) + (s/3600));

        System.out.println("Speed in m/s: " + sp1);
        System.out.println("Speed in km/h: " + sp2);
        System.out.println("Speed in miles/hr: " + sp3);
    }
}