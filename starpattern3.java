//Write a Java program to generate the following * triangles.
/*   ******                                                   
      *****                                                   
       ****                                                   
        ***                                                   
         **                                                   
          *    */

import java.util.*;

class starpattern3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        
        for(int i=n; i>0; i--){
            for(int j=0; j<=(n-i); j++) { System.out.print(" "); }
            for(int k=1; k<=i; k++) { System.out.print("*"); }
            System.out.println();
        }
    }
}