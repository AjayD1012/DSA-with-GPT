package DSA.Loops;

import java.util.Scanner;

public interface Program14AdditionOfDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        int sum = 0;
        int digit ;
        while (num != 0) {

             digit = num % 10 ;
             sum = sum+digit;
             num = num /10;

        }
        System.out.println(sum);
    }
}
