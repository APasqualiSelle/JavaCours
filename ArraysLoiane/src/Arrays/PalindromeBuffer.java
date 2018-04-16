package Arrays;

public class PalindromeBuffer {
    public static void main(String[] args){

        int num =1234567;
        StringBuffer buffer = new StringBuffer(num + "");
        buffer.reverse();
        System.out.println(buffer);


    }

  /*  public static int reverse(int num) {
        StringBuffer str = new StringBuffer(num + " ");
        return Integer.parseInt(str.reverse().toString());
    }*/

   /* public static boolean isPalindrome(int num) {
        return (num == reverse(num));
    }*/




    }
