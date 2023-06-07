//Write a Java program to find the sum of the two elements of a given array equal to a given integer.

import java.util.*;

class three{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Length of array: ");
        int l = sc.nextInt();
        int[] a = new int[l];
        
        for(int i=0; i<l; i++){
            a[i] = sc.nextInt(); 
        }

        for(int i=0; i<l; i++){
            for(int j=i+1; j<l; j++){
                for(int k=0; k<l; k++){
                    if(a[i]+a[j]==a[k]){
                        System.out.println("pair: " + a[i] + "+" + a[j] + " = " + a[k]);
                    }
                }
            }
        }
    }
}