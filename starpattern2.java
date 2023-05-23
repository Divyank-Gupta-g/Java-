//Write a Java program to generate the following * triangles.
/*    *                                                  
     **                                                  
    ***                                                  
   ****                                                  */

import java.util.*;

class starpattern2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        for(int i=n; i!=0; i--){
            for(int j=(n-i); j<n; j++) { System.out.print(" "); }
            for(int k=i; k<=n; k++) { System.out.print("*"); }
            System.out.println();
        }
    }
}