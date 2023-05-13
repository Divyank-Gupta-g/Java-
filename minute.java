import java.util.*;

class minute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int m = sc.nextInt();
        int y = m/(60*24*365);
        int d = (m/(60*24)) - (y*365);
        System.out.println(m + "minutes approximately equals to " + y + "years and " + d + "days.");
    }
}