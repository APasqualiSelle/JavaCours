public class PalindromeBySofiane {
    public static void main(String[] args) {


        String s = "123";
        System.out.println(isPalindrome(s));
    }
        static Boolean isPalindrome (String s){

            char c = ' ';
            int i = s.length() - 1;
            int j = 0;
            while (i > j) {
                c = s.charAt(i);
                if (c != s.charAt(j))
                    return false;
                --i;
                j++;
            }
            return true;
        }
    }

