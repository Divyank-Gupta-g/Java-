//Write a Java program to find the second smallest element in an array.

import java.util.*;

class secondmin{
    public static void main(String[] args){
        int[] a = {8, 4, 6, 1, 5, 5, 1};

        int l = a.length;
        Arrays.sort(a);

        int min = a[0];

        int i = l-1;

        while(a[i]==min){ i = i-1; }

        System.out.println("Second minimum element: " + a[i]);
    }
}