//Write a Java program to display Pascal's triangle.
/*    1                                                                          
     1 1                                                                         
    1 2 1                                                                        
   1 3 3 1                                                                       
  1 4 6 4 1              */

import java.util.*;

class pascal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        int c = 1;
        
        for(int i=0; i<n; i++) {
            for(int j=1; j<=(n-i); j++) { System.out.print(" "); }
            for(int k=0; k<=i; k++) {
                if(k==0 || i==0) { c=1; }
                else { c = c*(i-k+1)/k; }
                System.out.print(c + " ");
            }
        System.out.println();
        }
    }


}