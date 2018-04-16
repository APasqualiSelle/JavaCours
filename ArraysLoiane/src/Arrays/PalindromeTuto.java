package Arrays;

import java.util.Scanner;

public class PalindromeTuto {

    public static void main(String[] args) {
        System.out.println("Enter with a word : ");

        Scanner clavier = new Scanner(System.in);
        char reponse = ' ';

        boolean isPal = true;
        do {

            String pal = clavier.nextLine();
            int startPos = 0;
            int endPos = pal.length() - 1;


            while (startPos < endPos) {

                //substring est une methode pour vérifier la positions de caracteres d'une String
                String startLetter = pal.substring(startPos, startPos + 1);
                String endLetter = pal.substring(endPos, endPos + 1);

                if (startLetter.equals(endLetter) == false) {

                    isPal = false;
                    break;
                }
                startPos++;
                endPos--;
            }

            if (isPal == true) {
                System.out.println(pal + " is a Arrays.Palindrome!");
            } else {
                System.out.println(pal + " is NOT a Arrays.Palindrome");
            }
            do {
                System.out.println("Would you like to try again?(O/N)");

                reponse = clavier.nextLine().charAt(0);

            } while (reponse != 'O' && reponse != 'N');
            System.out.println("Enter another word: ");
        }

        while (reponse == 'O');
        System.out.println("Good bye!");
    }

    }


