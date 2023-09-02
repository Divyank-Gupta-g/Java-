/* Array is a data structure that stores the same type of data in sequential manner.
* An array takes a contiguous section of memory. */

package com.scaler;

import java.util.Arrays;

public class DG_16_01_Arrays {
    public static void main(String[] args) {
        // data_type[] array_name = new data_type[value];
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 96;
        marks[2] = 98;

        System.out.println(marks);      // return the memory location of marks[0].

        System.out.println(marks[0]);
        System.out.println(marks[2]);
        System.out.println(marks[1]);

        System.out.println(marks.length);       // length of array

        System.out.println((marks[0]));
        Arrays.sort(marks);                 // sort array in ascending order
        System.out.println(marks[0]);

        int [] mark = {98, 95, 97};
        System.out.println(mark[1]);
    }
}
