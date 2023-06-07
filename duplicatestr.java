//Write a Java program to find duplicate values in an array of string values.

import java.util.*;

class duplicatestr{
    public static void main(String[] args){
        String[] a = {"Ram", "Shyam", "Ram", "Sita"};

        for(int i=0; i<(a.length)-1; i++){
            for(int j=i+1; j<(a.length); j++){
                if(a[i]==a[j]){
                    System.out.println("Duplicate element: " + a[i]);
                }
            }
        }
    }
}