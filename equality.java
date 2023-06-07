//Write a Java program to test two arrays' equality.

import java.util.*;

class equality{
    static void equality_check(int[] a1, int[] a2){
        boolean res = true;

        if(a1.length == a2.length){
            for(int i=0; i<a1.length; i++){
            if(a1[i] != a2[i]){ res = false; }
            }
        }
        else{ 
            res = false;
        }
        if(res){
            System.out.println("Both arrays are equal to each other.");
        }
        else{
            System.out.println("Arrays are not equal to each other.");
        }
    }

    public static void main(String[] args){

        int[] a1 = {2, 4, 6, 8};
        int[] a2 = {2, 4, 5, 8};
        int[] a3 = {2, 4, 6};
        int[] a4 = {2, 4, 6, 8, 10};
        int[] a5 = {2, 4, 6, 8};
        int[] a6 = {1, 3, 5, 7};
        equality_check(a1, a2);
        equality_check(a1, a3);
        equality_check(a1, a4);
        equality_check(a1, a5);
        equality_check(a6, a1);
    }
}