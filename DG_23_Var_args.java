// In Java, the argumnts of a method can accept arbitrary number of values.
// This argument that can accept variable number of values is called varargs.

package com.scaler;

public class DG_23_Var_args {
    static float avg(float... varargs) {        // we can give any name at the place of varargs.
        float s = 0;                            // varargs is used when the number of variables is unknown.

        for(float n : varargs) {
            s += n;
        }

        return s/varargs.length;
    }

    public static void main(String[] args) {
        float avg1 = avg(1, 2, 3, 4, 5);
        float avg2 = avg(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println(avg1);
        System.out.println(avg2);
    }
}
