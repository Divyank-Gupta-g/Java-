//Write a Java program to check whether there is a pair with a specified sum in a given sorted and rotated array. 

import java.util.*;

public class sortedsum{
    static boolean sortsum(int[] a, int l, int s){

        int i;
        for(i=0; i<l; i++){				//find pivot element to rotate about.
            if(a[i]>a[i+1])
                break;
        }

        int p = (i+1)%l;
        int q = i;

        while(p!=q){
            if(a[p]+a[q]==s)
                return true;
            
            if(a[p]+a[q]<s)
                p = (p+1)%l;

            else
                q = (l+q-1)%l;
        }
        return false;
    }

    public static void main(String[] args){
        int a[] = {11, 15, 6, 8, 9, 10};
        int l = a.length;
        int s = 16;

        if(sortsum(a, l, s))
            System.out.println("Array has a pair of element with sum 16.");
        else
            System.out.println("Array has no any pair of element with sum 16.");
    }
}