//Write a Java program to find a missing number in an array.(Summation approach).

import java.util.*;

class miss{
    public static void main(String[] args){
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};

        int n = 7;

        int expected_sum = n * (n + 1)/2;

        int sum =0;

        for(int ele:arr){
            sum += ele;
        }

        System.out.println("Missing number: " + (expected_sum - sum));
    }
}

