package com.company;

public class DG_16_Exception_Handling {
    public static void main(String[] args) {
        int[] marks = {98, 97, 99};
        try {
            System.out.println(marks[5]);       // array index(5) out of bound(2) exception.
        } catch(Exception exception) {
            // do something after catching.
        }
        System.out.println("The End.");
    }
}
