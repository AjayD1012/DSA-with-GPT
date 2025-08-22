package DSA.controlflow;

public class Program11ReverseNumber {
    public static void main(String[] args) {

        int num = 12345;

        int rev =0;
        // must suggested to use while loop just remember.

       while ( num != 0){

            int digit = num%10;
            rev = rev *10 +digit;
            num = num /10;
       }
        System.out.println("reversed number :" +rev);
    }
}
