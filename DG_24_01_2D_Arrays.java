// 2D Array are simply array of arrays.
// Each element is an array itself.
// These can be used to store matrices or grids.

package com.scaler;

public class DG_24_01_2D_Arrays {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3, 4}, {4, 5, 6, 7}, {7, 8, 9, 10}};
        System.out.println(a[0]);           // returns the memory location of array

        System.out.println(a);              // memory location of entire array.

        System.out.println(a[0][1]);        // access to the specific element of array
        System.out.println(a[1][2]);

        System.out.println(a.length);       // number of arrays in 2D Array.
        System.out.println(a[0].length);    // length of array at specific index in 2D array.
    }
}
