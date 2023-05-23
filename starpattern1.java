//Write a Java program to display the pattern like a diamond.

import java.util.*;

class starpattern1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows(half of diamind): ");
        int n = sc.nextInt();
        int i, j, k;

        for(i=1; i<=n; i++){
            for(j=(n-i); j!=0; j--){ System.out.print(" "); }
            for(k=(2*i)-1; k!=0; k--) { System.out.print("*"); }
            System.out.println();
        }
        for(i=(n-1); i>=1; i--){
            for(j=1; j<=(n-i); j++){ System.out.print(" "); }
            for(k=1; k<=(2*i)-1; k++){ System.out.print("*"); }
            System.out.println();
        }
    }
}