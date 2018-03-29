public class PalindromeBuffer2 {
 static int num = 5;
    public static void main(String[]args){


        System.out.println(isPalindrome(321));
        System.out.println(PalindromeBuffer2.hello2(12345));
        System.out.println(PalindromeBuffer2.num);

    }
    public static int hello2(int num){


        StringBuffer str = new StringBuffer(num+"");
        return Integer.parseInt(str.reverse().toString());
    }

   public static int reverse(int num){
       int rev =0;
       while(num>0){
           int r = num % 10;
           rev = rev*10+r;
           num/=10;
       }
       return rev;
   }

    public static boolean isPalindrome(int num){
        return (num == reverse(num));
    }



}
