import java.util.*;

class add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number between 0 to 1000: ");
        int n = sc.nextInt();
        int s = 0;

        while(n>0) {
            int r = n%10;
            s = s+r;
            n = n/10;
        }
        System.out.println("Sum of all digits: " + s);
    }
}