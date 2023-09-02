package com.company;

import java.util.Arrays;            // import Arrays class for sorting

public class DG_02_Arrays {
    public static void main(String[] args) {
        // data_type [] array_name = new data_type[value];
        int [] marks = new int[3];
        marks[0] = 97;
        marks[1] = 96;
        marks[2] = 98;
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
