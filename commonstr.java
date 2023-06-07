//Write a Java program to find common elements between two arrays (string values).

import java.util.*;

class commonstr{
    public static void main(String[] args){
        String[] a = {"Jai", "Shree", "Ram"};
        String[] b = {"Hare", "Ram", "Hare", "Krishna"};

        for(int i=0; i<(a.length); i++){
            for(int j=0; j<(b.length); j++){
                if(a[i]==b[j]){
                    System.out.println("Common element: " + a[i]);
                }
            }
         }
    }
}