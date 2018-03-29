

public class PalindromeNumber {

    public static void main(String[] args){
        //before coding, we need to find what is the logic on it

        int n = 123321, v, s=0;
        int t = n;
        while(n>0){

            v = n%10;//-> 3#2#1
            n=n/10;//-> 12 #1#0
            s=s*10+v;//->3 #32#321
        }

        if(t == s){
            System.out.println("This number is a palindrome");
        } else {
            System.out.println("This number is NOT a palindrome");
        }

    }

}
