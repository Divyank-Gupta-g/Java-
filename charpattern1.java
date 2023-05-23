//Write a Java program to display the character rhombus structure.

import java.util.*;

class charpattern1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines(half of rhombus): ");
        int n = sc.nextInt();
        char c = 'A';
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){ System.out.print(" "); }
            for(int k=1; k<=(2*i)-1; k++){
                if(k==1){ c = c; }
                else if(k<=i) { c++; }
                else { c--; }
                System.out.print(c);
             }
        System.out.println();
        }

        for(int i=(n-1); i>=1; i--){
            for(int j=1; j<=(n-i); j++){ System.out.print(" "); }
            for(int k=1; k<=(2*i)-1; k++){
                if(k==1){ c=c; }
                else if(k<=i){ c++; }
                else { c--; }
                System.out.print(c);
            }
        System.out.println();
        }
    }
}