//Write a Java program to print the following grid.
/*        - - - - -                                                                                           
          - - - - -                                                                                          
          - - - - -                                                                                          
          - - - - -                                                                                           
          - - - - -                */

import java.util.*;

class dashgrid{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){ System.out.print("-" + " "); }
            System.out.println();
        }
    }
}