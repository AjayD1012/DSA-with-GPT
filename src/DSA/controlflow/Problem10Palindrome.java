package DSA.controlflow;

import java.util.Scanner;

public class Problem10Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ");
        String Word = sc.nextLine();

        String reverse ="";
        for (int i = Word.length() -1 ; i>=0 ; i--)
        {
            reverse = reverse+ Word.charAt(i);
        }
        if (Word.equalsIgnoreCase(reverse)){
            System.out.println(Word +" Is Palindrome ");
        }
        else System.out.println(Word +" Is Not Palindrome");
    }
}
