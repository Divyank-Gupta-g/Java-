/* Given a stream of numbers, read the numbers till you read a negative number
* and print the sum of the numbers read so far.*/

package com.scaler;

import java.util.Scanner;

public class DG_14_3_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = 0;
        int n;

        System.out.println(("Enter numbers: "));

        do {
            n = sc.nextInt();
            s += n;
        } while(n>=0);

        System.out.println("Sum = " + s);
    }
}
