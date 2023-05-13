import java.util.*;

class digits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        
        while (n>0) {
            int r = n%10;
            System.out.print(r + " ");
            n = n/10;
        }
    }
}