/* WAP to generate random numbers between [1, 10] and print them to the output.
* Terminate when you get 5.
* and also skip all multiple of 4. */

package com.scaler;

public class DG_52_Random_game {
    public static void main(String[] args) {
        while(true) {
            int n = (int)(Math.random() * 10 +1);
            if (n%4 == 0)
                continue;
            else if (n == 5)
                break;
            System.out.println(n);
        }
    }
}
