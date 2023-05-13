import java.util.*;

class time{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter current time in GMT = ");
        long gmt = sc.nextInt();
        long total_ms = System.currentTimeMillis();
        long total_sec = total_ms/1000;
        long current_sec = total_sec%60;
        long total_mnts = total_sec/60;
        long current_mnts = total_mnts%60;
        long total_hrs = total_mnts/60;
        long current_hrs = ((total_hrs + gmt) % 24);
        System.out.println("Current time is: " + current_hrs + ":" + current_mnts + ":" + current_sec);
    }
}