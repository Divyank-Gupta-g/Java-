//Write a Java program to find the second largest element in an array.

import java.util.*;

class secondmax{
    public static void main(String[] args){
        int[] a = {2, 4, 6, 9, 2, 8, 10};

        int l = a.length;

        System.out.println("Array: " + Arrays.toString(a));
        
        Arrays.sort(a);

        int i = l-1;

        while(a[i] == a[l-1]){ i--; }

        System.out.println("Second largest element: " + a[i]);
    }
}