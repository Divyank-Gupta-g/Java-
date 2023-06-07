//Write a Java program to convert an array to an ArrayList.

import java.util.*;

class arraylst{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int l = sc.nextInt();
        String[] a = new String[l];

        System.out.println("Enter array elements: ");
        for(int i=0; i<l; i++){
            a[i] = sc.next();
        }

        ArrayList<String> list = new ArrayList<String>(Arrays.asList(a));
        System.out.println("List: " + list);
    }
}