//Write a Java program to move all 0's to the end of an array. Maintain the relative order of the other (non-zero) array elements.

import java.util.*;

class order{
    public static void main(String[] args){
        int[] arr = {0, 0, 1, 2, 4, 0, 5, 6, 0};
        int c = 0;

        for(int i=0; i<arr.length;){
            if(arr[i]==0){ i++; }
            else{
                int temp = arr[c];
                arr[c] = arr[i];
                arr[i] = temp;
                c++;
                i++;
            }
        }

        while(c<arr.length)
        arr[c++] = 0;

        System.out.print("Rearranged array: ");
        for(int n : arr){
            System.out.print(n + " ");
        }
            System.out.print("\n");
    }
}