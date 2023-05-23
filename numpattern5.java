//Write a Java program to display the number rhombus structure.

import java.util.*;

class numpattern5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows(half of diamond): ");
        int n = sc.nextInt();
        int c=1;

        for(int i=1; i<=n; i++){
            for(int j=0; j<=(n-i); j++){ System.out.print(" "); }
            for(int k=1; k<=(2*i)-1; k++){
                if(i==k) { c=1; }
                else if(k<i) { c = (i-k+1); }
                else { c=(k-i+1); }
                System.out.print(c);
            }
            System.out.println();
        }

        for(int i=(n-1); i>=1; i--){
            for(int j=(n-i); j>=0; j--){ System.out.print(" "); }
            for(int k=1; k<=(2*i)-1; k++){ 
                if(k==i){ c=1; }
                else if(k<i){ c=(i-k)+1; }
                else { c=(k-i)+1; }
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
                