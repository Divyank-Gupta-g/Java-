//Write a Java program that requires the user to enter a single character from the alphabet. Print Vowel or Consonant, depending on user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.

import java.util.*;

class char{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter: ");
        String alph = sc.next().toLowerCase();

        if (alph.length() > 1) { System.out.println("Error, not a single character"); }
        else if (alph=='a' || alph=='e' || alph=='i' || alph=='o' || alph=='u') {
            System.out.println("Vowel");
        }
        else { System.out.println("Consonant"); }
    }
}