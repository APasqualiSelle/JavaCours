import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez un mot ");
        }



    }


 /*Scanner in = new Scanner(System.in);
                boolean result = true;

                System.out.println("Entrez un mot ou une phrase : ");

                String chaine = in.nextLine();
                //  Expression régulière (regex) : le symbole "^" signifie que l'on ne veut pas des caractères énumérés dans les crochets
                //  Ainsi, on recherche tout caractère qui ne soit pas dans l'alphabet de a à z et de A à Z.
                //  Le "+" est un quantifieur, celui-ci veut dire qu'un caractère peut apparaître 1 ou plusieurs fois.
                //  chaine.replaceAll("[^a-zA-Z]+", "") signifie donc que l'on va replacer par rien tout caractère autre que l'alphabet
                chaine = chaine.replaceAll("[^a-zA-Z]+", "")
                        .toLowerCase();

                for (int i = 0; i < chaine.length()/2; i++) {
                    if ((chaine.charAt(i) != chaine.charAt(chaine.length() - (i + 1)))) {
                        result = false;
                        break;
                    }
                }
                if (result == true)
                    System.out.println("C'est un palindrome !");
                else
                    System.out.println("Ce n'est pas un palindrome !");

            }*/
       /* Scanner clavier = new Scanner(System.in);
        char wish = ' ';

        do {
            System.out.println("Ecrivez un palindrome :");
            String chaine = clavier.nextLine().toLowerCase();

            int leftPos = 0;
            int rightPos = chaine.length() - 1;
            boolean palindrome = true;

            while ((leftPos < rightPos) && palindrome) {
                if (chaine.charAt(leftPos) != chaine.charAt(rightPos)) {
                    palindrome = false;
                }
                leftPos++;
                rightPos--;
            }

            if (palindrome) {
                System.out.println("C'est un palindrôme !");
            } else {
                System.out.println("Non, ce n'est pas un palindrôme.");
            }


            do {
                System.out.println("Voulez-vous réessayer ? (O/N)");
                wish = clavier.nextLine().charAt(0);
            } while (wish != 'O' && wish != 'N');
        } while (wish == 'O');
    }*/