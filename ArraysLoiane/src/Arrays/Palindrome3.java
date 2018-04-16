package Arrays;

import java.util.Scanner;

public class Palindrome3 {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String original;
        String reverse = "";


            System.out.println("Enter a String to check if it is a palindrome string");
            original = in.next();

            int len = original.length();
            for (int i = len - 1; i > -1; i--)
                reverse = reverse + original.charAt(i);
            if (original.equals(reverse)) {
                System.out.println("Entered string is a palindrome");
            } else {
                System.out.println("Entered string is not a palindrome");
            }

            System.out.println("Voulez-vous reessayer? (O/N)");


        }


    }


