// for-each loop is also called 'enhanced for loop', was introduced in Java5'.
// It is an alternative approach for traversing the iterable.
// As the name suggests, It is mainly used to iterate over each of the iterable elements one by one.

package com.scaler;

public class DG_17_For_Each_Loop {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        for (int n : arr) {
            System.out.println(n);
        }

        // Check whether the key value is present or not.

        int k = 5;

        boolean found = false;

        for (int n : arr) {
            if (n == k){
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Found.");
        else
            System.out.println("Not found.");
    }
}
