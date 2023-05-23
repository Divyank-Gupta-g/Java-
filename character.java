//Write a Java program that requires the user to enter a single character from the alphabet. Print Vowel or Consonant, depending on user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.

import java.util.*;

class character{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter: ");
        String alph = sc.next().toLowerCase();

        boolean uppercase = alph.charAt(0)>=65 && alph.charAt(0)<=90;
        boolean lowercase = alph.charAt(0)>=97 && alph.charAt(0)<=122;
        boolean res = alph.equals('a') || alph.equals('e') || alph.equals('i') || alph.equals('o') || alph.equals('u');

        if(alph.length()>1) { System.out.println("Error, not a single character"); }
        else if (!(uppercase || lowercase)) { System.out.println("Please enter a valid letter."); }
        else if(res) {System.out.println("Vowel.");}
        else { System.out.println("Consonent."); }
    }
}