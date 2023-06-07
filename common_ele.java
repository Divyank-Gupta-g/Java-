//Write a Java program to find common elements in three sorted (in non-decreasing order) arrays.

import java.util.*;

class common_ele{
    static void common(int[] a1, int[] a2, int[] a3){
        int l1 = a1.length;
        int l2 = a2.length;
        int l3 = a3.length;

        boolean res = false;

        for(int i=0; i<l1; i++){
            for(int j=0; j<l2; j++){
                for(int k=0; k<l3; k++){
                    if(a1[i] == a2[j] && a2[j] == a3[k]){
                        res = true;
                        continue;
                    }
                }
            }
            if(res){ System.out.println("Common element: " + a1[i]); }
        }


    }

    public static void main(String[] args){
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {5, 6, 7, 8, 4};
        int[] a3 = {4, 5, 8, 9};

        common(a1, a2, a3);
    }
}