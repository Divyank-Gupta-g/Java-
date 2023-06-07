//Write a Java program to convert an ArrayList to an array.

import java.util.*;

class lst_arr{
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        
        list.add("Jai");
        list.add("Shree");
        list.add("Ram");

        String[] arr = new String[list.size()];

        list.toArray(arr);

        for(String item:arr){
            System.out.print(item + "\t");
        }
    }
}